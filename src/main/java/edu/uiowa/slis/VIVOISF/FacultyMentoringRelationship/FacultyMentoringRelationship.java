package edu.uiowa.slis.VIVOISF.FacultyMentoringRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class FacultyMentoringRelationship extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMentoringRelationship currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMentoringRelationship.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			FacultyMentoringRelationshipIterator theFacultyMentoringRelationshipIterator = (FacultyMentoringRelationshipIterator) findAncestorWithClass(this, FacultyMentoringRelationshipIterator.class);

			if (theFacultyMentoringRelationshipIterator != null) {
				subjectURI = theFacultyMentoringRelationshipIterator.getSubjectURI();
				label = theFacultyMentoringRelationshipIterator.getLabel();
			}

			if (theFacultyMentoringRelationshipIterator == null && subjectURI == null) {
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
			log.error("Exception raised in FacultyMentoringRelationship doStartTag", e);
			throw new JspTagException("Exception raised in FacultyMentoringRelationship doStartTag");
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
			log.error("Exception raised in FacultyMentoringRelationship doEndTag", e);
			throw new JspTagException("Exception raised in FacultyMentoringRelationship doEndTag");
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