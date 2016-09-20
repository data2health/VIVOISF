package edu.uiowa.slis.VIVOISF.Phase4ClinicalTrial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Phase4ClinicalTrial extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase4ClinicalTrial currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase4ClinicalTrial.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Phase4ClinicalTrialIterator thePhase4ClinicalTrialIterator = (Phase4ClinicalTrialIterator) findAncestorWithClass(this, Phase4ClinicalTrialIterator.class);

			if (thePhase4ClinicalTrialIterator != null) {
				subjectURI = thePhase4ClinicalTrialIterator.getSubjectURI();
				label = thePhase4ClinicalTrialIterator.getLabel();
			}

			if (thePhase4ClinicalTrialIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Phase4ClinicalTrial doStartTag", e);
			throw new JspTagException("Exception raised in Phase4ClinicalTrial doStartTag");
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
			log.error("Exception raised in Phase4ClinicalTrial doEndTag", e);
			throw new JspTagException("Exception raised in Phase4ClinicalTrial doEndTag");
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
