package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class CoreLaboratory extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratory currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratory.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;
	String abbreviation = null;
	String overview = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			CoreLaboratoryIterator theCoreLaboratoryIterator = (CoreLaboratoryIterator) findAncestorWithClass(this, CoreLaboratoryIterator.class);

			if (theCoreLaboratoryIterator != null) {
				subjectURI = theCoreLaboratoryIterator.getSubjectURI();
				label = theCoreLaboratoryIterator.getLabel();
			}

			if (theCoreLaboratoryIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(Prefix_1_4
				+ " SELECT ?label  ?abbreviation ?overview where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#abbreviation> ?abbreviation } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#overview> ?overview } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					abbreviation = sol.get("?abbreviation") == null ? null : sol.get("?abbreviation").toString();
					overview = sol.get("?overview") == null ? null : sol.get("?overview").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in CoreLaboratory doStartTag", e);
			throw new JspTagException("Exception raised in CoreLaboratory doStartTag");
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
			log.error("Exception raised in CoreLaboratory doEndTag", e);
			throw new JspTagException("Exception raised in CoreLaboratory doEndTag");
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

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getOverview() {
		return overview;
	}

}