package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class LegalCaseDocumentHandleIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentHandleIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentHandleIterator.class);

	String subjectURI = null;
	String handle = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			LegalCaseDocument ancestorInstance = (LegalCaseDocument) findAncestorWithClass(this, LegalCaseDocument.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://purl.org/ontology/bibo/handle> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				handle = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in LegalCaseDocumentIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in LegalCaseDocumentIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				handle = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in LegalCaseDocumentIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in LegalCaseDocumentIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in LegalCaseDocument doEndTag", e);
			throw new JspTagException("Exception raised in LegalCaseDocument doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

}