package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class CollectedDocumentPageStartIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentPageStartIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentPageStartIterator.class);

	String subjectURI = null;
	String pageStart = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			CollectedDocument ancestorInstance = (CollectedDocument) findAncestorWithClass(this, CollectedDocument.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://purl.org/ontology/bibo/pageStart> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				pageStart = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in CollectedDocumentIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in CollectedDocumentIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				pageStart = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in CollectedDocumentIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in CollectedDocumentIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in CollectedDocument doEndTag", e);
			throw new JspTagException("Exception raised in CollectedDocument doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setPageStart(String pageStart) {
		this.pageStart = pageStart;
	}

	public String getPageStart() {
		return pageStart;
	}

}