package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class GeographicRegionPopulationUnitIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionPopulationUnitIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionPopulationUnitIterator.class);

	String subjectURI = null;
	String populationUnit = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			GeographicRegion ancestorInstance = (GeographicRegion) findAncestorWithClass(this, GeographicRegion.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#populationUnit> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				populationUnit = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in GeographicRegionIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in GeographicRegionIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				populationUnit = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in GeographicRegionIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in GeographicRegionIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in GeographicRegion doEndTag", e);
			throw new JspTagException("Exception raised in GeographicRegion doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setPopulationUnit(String populationUnit) {
		this.populationUnit = populationUnit;
	}

	public String getPopulationUnit() {
		return populationUnit;
	}

}