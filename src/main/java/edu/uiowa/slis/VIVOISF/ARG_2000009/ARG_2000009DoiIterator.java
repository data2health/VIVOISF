package edu.uiowa.slis.VIVOISF.ARG_2000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ARG_2000009DoiIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000009DoiIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000009DoiIterator.class);

	String subjectURI = null;
	String doi = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ARG_2000009 ancestorInstance = (ARG_2000009) findAncestorWithClass(this, ARG_2000009.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://purl.org/ontology/bibo/doi> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				doi = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in ARG_2000009Iterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ARG_2000009Iterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				doi = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in ARG_2000009Iterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ARG_2000009Iterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in ARG_2000009 doEndTag", e);
			throw new JspTagException("Exception raised in ARG_2000009 doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getDoi() {
		return doi;
	}

}
