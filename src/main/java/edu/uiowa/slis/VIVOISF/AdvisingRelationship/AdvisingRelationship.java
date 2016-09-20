package edu.uiowa.slis.VIVOISF.AdvisingRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class AdvisingRelationship extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdvisingRelationship currentInstance = null;
	private static final Log log = LogFactory.getLog(AdvisingRelationship.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			AdvisingRelationshipIterator theAdvisingRelationshipIterator = (AdvisingRelationshipIterator) findAncestorWithClass(this, AdvisingRelationshipIterator.class);

			if (theAdvisingRelationshipIterator != null) {
				subjectURI = theAdvisingRelationshipIterator.getSubjectURI();
				label = theAdvisingRelationshipIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AcademicDegree.AcademicDegreeDegreeCandidacyInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AcademicDegree.AcademicDegreeDegreeCandidacyInverseIterator)this.getParent()).getDegreeCandidacyInverse();
			}

			if (theAdvisingRelationshipIterator == null && subjectURI == null) {
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
			log.error("Exception raised in AdvisingRelationship doStartTag", e);
			throw new JspTagException("Exception raised in AdvisingRelationship doStartTag");
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
			log.error("Exception raised in AdvisingRelationship doEndTag", e);
			throw new JspTagException("Exception raised in AdvisingRelationship doEndTag");
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
