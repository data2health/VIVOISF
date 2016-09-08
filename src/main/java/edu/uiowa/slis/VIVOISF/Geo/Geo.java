package edu.uiowa.slis.VIVOISF.Geo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Geo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geo currentInstance = null;
	private static final Log log = LogFactory.getLog(Geo.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			GeoIterator theGeoIterator = (GeoIterator) findAncestorWithClass(this, GeoIterator.class);

			if (theGeoIterator != null) {
				subjectURI = theGeoIterator.getSubjectURI();
				label = theGeoIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Geographical.GeographicalHasGeoIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Geographical.GeographicalHasGeoIterator)this.getParent()).getHasGeo();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Kind.KindHasGeoIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Kind.KindHasGeoIterator)this.getParent()).getHasGeo();
			}

			edu.uiowa.slis.VIVOISF.Geographical.GeographicalHasGeoIterator theGeographicalHasGeoIterator = (edu.uiowa.slis.VIVOISF.Geographical.GeographicalHasGeoIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Geographical.GeographicalHasGeoIterator.class);

			if (subjectURI == null && theGeographicalHasGeoIterator != null) {
				subjectURI = theGeographicalHasGeoIterator.getHasGeo();
			}

			edu.uiowa.slis.VIVOISF.Kind.KindHasGeoIterator theKindHasGeoIterator = (edu.uiowa.slis.VIVOISF.Kind.KindHasGeoIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Kind.KindHasGeoIterator.class);

			if (subjectURI == null && theKindHasGeoIterator != null) {
				subjectURI = theKindHasGeoIterator.getHasGeo();
			}

			if (theGeoIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(Prefix_1_4
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Geo doStartTag", e);
			throw new JspTagException("Exception raised in Geo doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Geo doEndTag", e);
			throw new JspTagException("Exception raised in Geo doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
