package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class EmeritusProfessorARG_0000197Iterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorARG_0000197Iterator currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorARG_0000197Iterator.class);

	String subjectURI = null;
	String ARG_0000197 = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			EmeritusProfessor ancestorInstance = (EmeritusProfessor) findAncestorWithClass(this, EmeritusProfessor.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://purl.obolibrary.org/obo/ARG_0000197> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				ARG_0000197 = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in EmeritusProfessorIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in EmeritusProfessorIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				ARG_0000197 = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in EmeritusProfessorIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in EmeritusProfessorIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in EmeritusProfessor doEndTag", e);
			throw new JspTagException("Exception raised in EmeritusProfessor doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setARG_0000197(String ARG_0000197) {
		this.ARG_0000197 = ARG_0000197;
	}

	public String getARG_0000197() {
		return ARG_0000197;
	}

}
