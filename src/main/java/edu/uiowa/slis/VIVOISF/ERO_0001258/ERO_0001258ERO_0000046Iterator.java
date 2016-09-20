package edu.uiowa.slis.VIVOISF.ERO_0001258;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ERO_0001258ERO_0000046Iterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001258ERO_0000046Iterator currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001258ERO_0000046Iterator.class);

	String subjectURI = null;
	String ERO_0000046 = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ERO_0001258 ancestorInstance = (ERO_0001258) findAncestorWithClass(this, ERO_0001258.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://purl.obolibrary.org/obo/ERO_0000046> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				ERO_0000046 = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in ERO_0001258Iterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ERO_0001258Iterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				ERO_0000046 = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in ERO_0001258Iterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ERO_0001258Iterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in ERO_0001258 doEndTag", e);
			throw new JspTagException("Exception raised in ERO_0001258 doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setERO_0000046(String ERO_0000046) {
		this.ERO_0000046 = ERO_0000046;
	}

	public String getERO_0000046() {
		return ERO_0000046;
	}

}
