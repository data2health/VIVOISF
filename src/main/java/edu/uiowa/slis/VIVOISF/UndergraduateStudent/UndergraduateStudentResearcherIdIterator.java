package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class UndergraduateStudentResearcherIdIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentResearcherIdIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentResearcherIdIterator.class);

	String subjectURI = null;
	String researcherId = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			UndergraduateStudent ancestorInstance = (UndergraduateStudent) findAncestorWithClass(this, UndergraduateStudent.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s where { <" + subjectURI + "> <http://vivoweb.org/ontology/core#researcherId> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				researcherId = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in UndergraduateStudentIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in UndergraduateStudentIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				researcherId = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in UndergraduateStudentIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in UndergraduateStudentIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in UndergraduateStudent doEndTag", e);
			throw new JspTagException("Exception raised in UndergraduateStudent doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setResearcherId(String researcherId) {
		this.researcherId = researcherId;
	}

	public String getResearcherId() {
		return researcherId;
	}

}