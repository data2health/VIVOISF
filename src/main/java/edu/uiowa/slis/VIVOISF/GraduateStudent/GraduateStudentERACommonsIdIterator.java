package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class GraduateStudentERACommonsIdIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentERACommonsIdIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentERACommonsIdIterator.class);

	String subjectURI = null;
	String eRACommonsId = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			GraduateStudent ancestorInstance = (GraduateStudent) findAncestorWithClass(this, GraduateStudent.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s where { <" + subjectURI + "> <http://vivoweb.org/ontology/core#eRACommonsId> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				eRACommonsId = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in GraduateStudentIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in GraduateStudentIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				eRACommonsId = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in GraduateStudentIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in GraduateStudentIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in GraduateStudent doEndTag", e);
			throw new JspTagException("Exception raised in GraduateStudent doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setERACommonsId(String eRACommonsId) {
		this.eRACommonsId = eRACommonsId;
	}

	public String getERACommonsId() {
		return eRACommonsId;
	}

}