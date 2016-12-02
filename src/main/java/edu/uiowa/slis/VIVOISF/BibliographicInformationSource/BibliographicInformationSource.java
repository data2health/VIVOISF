package edu.uiowa.slis.VIVOISF.BibliographicInformationSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class BibliographicInformationSource extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BibliographicInformationSource currentInstance = null;
	private static final Log log = LogFactory.getLog(BibliographicInformationSource.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			BibliographicInformationSourceIterator theBibliographicInformationSourceIterator = (BibliographicInformationSourceIterator) findAncestorWithClass(this, BibliographicInformationSourceIterator.class);

			if (theBibliographicInformationSourceIterator != null) {
				subjectURI = theBibliographicInformationSourceIterator.getSubjectURI();
				label = theBibliographicInformationSourceIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GlobalCitationCount.GlobalCitationCountHasGlobalCountSourceIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GlobalCitationCount.GlobalCitationCountHasGlobalCountSourceIterator)this.getParent()).getHasGlobalCountSource();
			}

			edu.uiowa.slis.VIVOISF.GlobalCitationCount.GlobalCitationCountHasGlobalCountSourceIterator theGlobalCitationCountHasGlobalCountSourceIterator = (edu.uiowa.slis.VIVOISF.GlobalCitationCount.GlobalCitationCountHasGlobalCountSourceIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GlobalCitationCount.GlobalCitationCountHasGlobalCountSourceIterator.class);

			if (subjectURI == null && theGlobalCitationCountHasGlobalCountSourceIterator != null) {
				subjectURI = theGlobalCitationCountHasGlobalCountSourceIterator.getHasGlobalCountSource();
			}

			if (theBibliographicInformationSourceIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?labelUS ?labelENG ?label ?labelANY ?foafName ?schemaName ?rdfValue  where {"
				+ "  OPTIONAL { SELECT ?labelUS  WHERE { <" + subjectURI + "> rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelENG WHERE { <" + subjectURI + "> rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?label    WHERE { <" + subjectURI + "> rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelANY WHERE { <" + subjectURI + "> rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?labelUS") == null ? null : sol.get("?labelUS").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelENG") == null ? null : sol.get("?labelENG").asLiteral().getString();
					if (label == null)
						label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelANY") == null ? null : sol.get("?labelANY").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in BibliographicInformationSource doStartTag", e);
			throw new JspTagException("Exception raised in BibliographicInformationSource doStartTag");
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
			log.error("Exception raised in BibliographicInformationSource doEndTag", e);
			throw new JspTagException("Exception raised in BibliographicInformationSource doEndTag");
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
