package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class FacultyMemberScopusIdIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberScopusIdIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberScopusIdIterator.class);

	String subjectURI = null;
	String scopusId = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			FacultyMember ancestorInstance = (FacultyMember) findAncestorWithClass(this, FacultyMember.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s where { <" + subjectURI + "> <http://vivoweb.org/ontology/core#scopusId> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				scopusId = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in FacultyMemberIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in FacultyMemberIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				scopusId = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in FacultyMemberIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in FacultyMemberIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in FacultyMember doEndTag", e);
			throw new JspTagException("Exception raised in FacultyMember doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setScopusId(String scopusId) {
		this.scopusId = scopusId;
	}

	public String getScopusId() {
		return scopusId;
	}

}