package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class special_groupNameShortARIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameShortARIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameShortARIterator.class);

	String subjectURI = null;
	String nameShortAR = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			special_group ancestorInstance = (special_group) findAncestorWithClass(this, special_group.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#nameShortAR> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				nameShortAR = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in special_groupIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in special_groupIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				nameShortAR = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in special_groupIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in special_groupIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in special_group doEndTag", e);
			throw new JspTagException("Exception raised in special_group doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setNameShortAR(String nameShortAR) {
		this.nameShortAR = nameShortAR;
	}

	public String getNameShortAR() {
		return nameShortAR;
	}

}