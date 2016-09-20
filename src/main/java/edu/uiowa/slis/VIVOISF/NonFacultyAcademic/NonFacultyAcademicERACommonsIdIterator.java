package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class NonFacultyAcademicERACommonsIdIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicERACommonsIdIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicERACommonsIdIterator.class);

	String subjectURI = null;
	String eRACommonsId = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			NonFacultyAcademic ancestorInstance = (NonFacultyAcademic) findAncestorWithClass(this, NonFacultyAcademic.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://vivoweb.org/ontology/core#eRACommonsId> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				eRACommonsId = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in NonFacultyAcademicIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in NonFacultyAcademicIterator doStartTag");
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
			log.error("Exception raised in NonFacultyAcademicIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in NonFacultyAcademicIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in NonFacultyAcademic doEndTag", e);
			throw new JspTagException("Exception raised in NonFacultyAcademic doEndTag");
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
