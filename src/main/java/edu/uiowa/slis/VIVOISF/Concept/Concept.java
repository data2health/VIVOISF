package edu.uiowa.slis.VIVOISF.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Concept extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Concept currentInstance = null;
	private static final Log log = LogFactory.getLog(Concept.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ConceptIterator theConceptIterator = (ConceptIterator) findAncestorWithClass(this, ConceptIterator.class);

			if (theConceptIterator != null) {
				subjectURI = theConceptIterator.getSubjectURI();
				label = theConceptIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Concept.ConceptRelatedIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Concept.ConceptRelatedIterator)this.getParent()).getRelated();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Concept.ConceptNarrowerIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Concept.ConceptNarrowerIterator)this.getParent()).getNarrower();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Person.PersonHasResearchAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Person.PersonHasResearchAreaIterator)this.getParent()).getHasResearchArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Chapter.ChapterHasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Chapter.ChapterHasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Conference.ConferenceHasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Conference.ConferenceHasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Concept.ConceptBroaderIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Concept.ConceptBroaderIterator)this.getParent()).getBroader();
			}

			edu.uiowa.slis.VIVOISF.Concept.ConceptRelatedIterator theConceptRelatedIterator = (edu.uiowa.slis.VIVOISF.Concept.ConceptRelatedIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Concept.ConceptRelatedIterator.class);

			if (subjectURI == null && theConceptRelatedIterator != null) {
				subjectURI = theConceptRelatedIterator.getRelated();
			}

			edu.uiowa.slis.VIVOISF.Concept.ConceptNarrowerIterator theConceptNarrowerIterator = (edu.uiowa.slis.VIVOISF.Concept.ConceptNarrowerIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Concept.ConceptNarrowerIterator.class);

			if (subjectURI == null && theConceptNarrowerIterator != null) {
				subjectURI = theConceptNarrowerIterator.getNarrower();
			}

			edu.uiowa.slis.VIVOISF.Person.PersonHasResearchAreaIterator thePersonHasResearchAreaIterator = (edu.uiowa.slis.VIVOISF.Person.PersonHasResearchAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Person.PersonHasResearchAreaIterator.class);

			if (subjectURI == null && thePersonHasResearchAreaIterator != null) {
				subjectURI = thePersonHasResearchAreaIterator.getHasResearchArea();
			}

			edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasSubjectAreaIterator theAcademicArticleHasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasSubjectAreaIterator.class);

			if (subjectURI == null && theAcademicArticleHasSubjectAreaIterator != null) {
				subjectURI = theAcademicArticleHasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.Chapter.ChapterHasSubjectAreaIterator theChapterHasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.Chapter.ChapterHasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Chapter.ChapterHasSubjectAreaIterator.class);

			if (subjectURI == null && theChapterHasSubjectAreaIterator != null) {
				subjectURI = theChapterHasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.Conference.ConferenceHasSubjectAreaIterator theConferenceHasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.Conference.ConferenceHasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Conference.ConferenceHasSubjectAreaIterator.class);

			if (subjectURI == null && theConferenceHasSubjectAreaIterator != null) {
				subjectURI = theConferenceHasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.Concept.ConceptBroaderIterator theConceptBroaderIterator = (edu.uiowa.slis.VIVOISF.Concept.ConceptBroaderIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Concept.ConceptBroaderIterator.class);

			if (subjectURI == null && theConceptBroaderIterator != null) {
				subjectURI = theConceptBroaderIterator.getBroader();
			}

			if (theConceptIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Concept doStartTag", e);
			throw new JspTagException("Exception raised in Concept doStartTag");
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
			log.error("Exception raised in Concept doEndTag", e);
			throw new JspTagException("Exception raised in Concept doEndTag");
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
