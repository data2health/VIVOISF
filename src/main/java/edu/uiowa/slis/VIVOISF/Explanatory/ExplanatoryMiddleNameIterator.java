package edu.uiowa.slis.VIVOISF.Explanatory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ExplanatoryMiddleNameIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExplanatoryMiddleNameIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(ExplanatoryMiddleNameIterator.class);

	static boolean firstInstance = false;
	static boolean lastInstance = false;

	String subjectURI = null;
	String middleName = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Explanatory ancestorInstance = (Explanatory) findAncestorWithClass(this, Explanatory.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://vivoweb.org/ontology/core#middleName> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				middleName = sol.get("?s").isLiteral() ? sol.get("?s").asLiteral().getString() : sol.get("?s").toString();
				firstInstance = true;
				lastInstance = ! rs.hasNext();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in ExplanatoryIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ExplanatoryIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				middleName = sol.get("?s").isLiteral() ? sol.get("?s").asLiteral().getString() : sol.get("?s").toString();
				firstInstance = false;
				lastInstance = ! rs.hasNext();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in ExplanatoryIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ExplanatoryIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Explanatory doEndTag", e);
			throw new JspTagException("Exception raised in Explanatory doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setMiddleName(String theMiddleName) {
		middleName = theMiddleName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public static void setFirstInstance(Boolean theFirstInstance) {
		firstInstance = theFirstInstance;
	}

	public static Boolean getFirstInstance() {
		return firstInstance;
	}

	public static void setLastInstance(Boolean theLastInstance) {
		lastInstance = theLastInstance;
	}

	public static Boolean getLastInstance() {
		return lastInstance;
	}

}
