package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class WebpageERO_0000045Iterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageERO_0000045Iterator currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageERO_0000045Iterator.class);

	String subjectURI = null;
	String ERO_0000045 = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Webpage ancestorInstance = (Webpage) findAncestorWithClass(this, Webpage.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://purl.obolibrary.org/obo/ERO_0000045> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				ERO_0000045 = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in WebpageIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in WebpageIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				ERO_0000045 = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in WebpageIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in WebpageIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Webpage doEndTag", e);
			throw new JspTagException("Exception raised in Webpage doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setERO_0000045(String ERO_0000045) {
		this.ERO_0000045 = ERO_0000045;
	}

	public String getERO_0000045() {
		return ERO_0000045;
	}

}
