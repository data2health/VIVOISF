package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class WorkingPaperEanucc13Iterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperEanucc13Iterator currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperEanucc13Iterator.class);

	String subjectURI = null;
	String eanucc13 = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			WorkingPaper ancestorInstance = (WorkingPaper) findAncestorWithClass(this, WorkingPaper.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://purl.org/ontology/bibo/eanucc13> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				eanucc13 = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in WorkingPaperIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in WorkingPaperIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				eanucc13 = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in WorkingPaperIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in WorkingPaperIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in WorkingPaper doEndTag", e);
			throw new JspTagException("Exception raised in WorkingPaper doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setEanucc13(String eanucc13) {
		this.eanucc13 = eanucc13;
	}

	public String getEanucc13() {
		return eanucc13;
	}

}