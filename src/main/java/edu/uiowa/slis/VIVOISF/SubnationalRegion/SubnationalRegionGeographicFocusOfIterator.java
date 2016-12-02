package edu.uiowa.slis.VIVOISF.SubnationalRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class SubnationalRegionGeographicFocusOfIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SubnationalRegionGeographicFocusOfIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(SubnationalRegionGeographicFocusOfIterator.class);

	String subjectURI = null;
	String geographicFocusOf = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			SubnationalRegion ancestorInstance = (SubnationalRegion) findAncestorWithClass(this, SubnationalRegion.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://vivoweb.org/ontology/core#geographicFocusOf> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				geographicFocusOf = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in SubnationalRegionIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in SubnationalRegionIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				geographicFocusOf = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in SubnationalRegionIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in SubnationalRegionIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in SubnationalRegion doEndTag", e);
			throw new JspTagException("Exception raised in SubnationalRegion doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setGeographicFocusOf(String geographicFocusOf) {
		this.geographicFocusOf = geographicFocusOf;
	}

	public String getGeographicFocusOf() {
		return geographicFocusOf;
	}

}
