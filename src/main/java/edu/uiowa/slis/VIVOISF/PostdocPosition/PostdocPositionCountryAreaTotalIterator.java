package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class PostdocPositionCountryAreaTotalIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionCountryAreaTotalIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionCountryAreaTotalIterator.class);

	String subjectURI = null;
	String countryAreaTotal = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			PostdocPosition ancestorInstance = (PostdocPosition) findAncestorWithClass(this, PostdocPosition.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#countryAreaTotal> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				countryAreaTotal = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in PostdocPositionIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in PostdocPositionIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				countryAreaTotal = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in PostdocPositionIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in PostdocPositionIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in PostdocPosition doEndTag", e);
			throw new JspTagException("Exception raised in PostdocPosition doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setCountryAreaTotal(String countryAreaTotal) {
		this.countryAreaTotal = countryAreaTotal;
	}

	public String getCountryAreaTotal() {
		return countryAreaTotal;
	}

}