package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ContinentValidUntilIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentValidUntilIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentValidUntilIterator.class);

	String subjectURI = null;
	String validUntil = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Continent ancestorInstance = (Continent) findAncestorWithClass(this, Continent.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#validUntil> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				validUntil = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in ContinentIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ContinentIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				validUntil = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in ContinentIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ContinentIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Continent doEndTag", e);
			throw new JspTagException("Exception raised in Continent doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setValidUntil(String validUntil) {
		this.validUntil = validUntil;
	}

	public String getValidUntil() {
		return validUntil;
	}

}