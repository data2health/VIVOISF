package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class LibrarianARG_0000197Iterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianARG_0000197Iterator currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianARG_0000197Iterator.class);

	String subjectURI = null;
	String ARG_0000197 = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Librarian ancestorInstance = (Librarian) findAncestorWithClass(this, Librarian.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s where { <" + subjectURI + "> <http://purl.obolibrary.org/obo/ARG_0000197> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				ARG_0000197 = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in LibrarianIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in LibrarianIterator doStartTag");
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
			log.error("Exception raised in LibrarianIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in LibrarianIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Librarian doEndTag", e);
			throw new JspTagException("Exception raised in Librarian doEndTag");
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