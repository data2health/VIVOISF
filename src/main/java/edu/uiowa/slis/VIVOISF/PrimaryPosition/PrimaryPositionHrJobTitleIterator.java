package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class PrimaryPositionHrJobTitleIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionHrJobTitleIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionHrJobTitleIterator.class);

	String subjectURI = null;
	String hrJobTitle = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			PrimaryPosition ancestorInstance = (PrimaryPosition) findAncestorWithClass(this, PrimaryPosition.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://vivoweb.org/ontology/core#hrJobTitle> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				hrJobTitle = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in PrimaryPositionIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in PrimaryPositionIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				hrJobTitle = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in PrimaryPositionIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in PrimaryPositionIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in PrimaryPosition doEndTag", e);
			throw new JspTagException("Exception raised in PrimaryPosition doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setHrJobTitle(String hrJobTitle) {
		this.hrJobTitle = hrJobTitle;
	}

	public String getHrJobTitle() {
		return hrJobTitle;
	}

}
