package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class StateOrProvinceBFO_0000050Iterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceBFO_0000050Iterator currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceBFO_0000050Iterator.class);

	String subjectURI = null;
	String BFO_0000050 = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			StateOrProvince ancestorInstance = (StateOrProvince) findAncestorWithClass(this, StateOrProvince.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://purl.obolibrary.org/obo/BFO_0000050> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				BFO_0000050 = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in StateOrProvinceIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in StateOrProvinceIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				BFO_0000050 = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in StateOrProvinceIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in StateOrProvinceIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in StateOrProvince doEndTag", e);
			throw new JspTagException("Exception raised in StateOrProvince doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setBFO_0000050(String BFO_0000050) {
		this.BFO_0000050 = BFO_0000050;
	}

	public String getBFO_0000050() {
		return BFO_0000050;
	}

}
