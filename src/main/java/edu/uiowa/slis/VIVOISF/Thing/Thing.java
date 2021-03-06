package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Thing extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Thing currentInstance = null;
	private static final Log log = LogFactory.getLog(Thing.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String placeOfPublication = null;
	String hideFromDisplay = null;
	String abbreviation = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ThingIterator theThingIterator = (ThingIterator) findAncestorWithClass(this, ThingIterator.class);

			if (theThingIterator != null) {
				subjectURI = theThingIterator.getSubjectURI();
				label = theThingIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingSubjectAreaOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingSubjectAreaOfIterator)this.getParent()).getSubjectAreaOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Concept.ConceptSubjectAreaOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Concept.ConceptSubjectAreaOfIterator)this.getParent()).getSubjectAreaOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0001025Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0001025Iterator)this.getParent()).getRO_0001025();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0001025Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0001025Iterator)this.getParent()).getRO_0001025();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0001025Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0001025Iterator)this.getParent()).getRO_0001025();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingRO_0001025Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingRO_0001025Iterator)this.getParent()).getRO_0001025();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Agent.AgentRO_0001025Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Agent.AgentRO_0001025Iterator)this.getParent()).getRO_0001025();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Person.PersonRO_0001025Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Person.PersonRO_0001025Iterator)this.getParent()).getRO_0001025();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Area.AreaRO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Area.AreaRO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Self_governing.Self_governingRO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Self_governing.Self_governingRO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Territory.TerritoryRO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Territory.TerritoryRO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006RO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006RO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141RO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141RO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Country.CountryRO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Country.CountryRO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationRO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationRO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionRO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionRO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityRO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityRO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Location.LocationRO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Location.LocationRO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingRO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingRO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002234Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002234Iterator)this.getParent()).getRO_0002234();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003RO_0002234Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003RO_0002234Iterator)this.getParent()).getRO_0002234();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015RO_0002234Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015RO_0002234Iterator)this.getParent()).getRO_0002234();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Event.EventRO_0002234Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Event.EventRO_0002234Iterator)this.getParent()).getRO_0002234();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Conference.ConferenceRO_0002234Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Conference.ConferenceRO_0002234Iterator)this.getParent()).getRO_0002234();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002234Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002234Iterator)this.getParent()).getRO_0002234();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Article.ArticleRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Article.ArticleRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Individual.IndividualRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Individual.IndividualRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Kind.KindRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Kind.KindRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Agent.AgentRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Agent.AgentRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BookSection.BookSectionRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BookSection.BookSectionRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Organization.OrganizationRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Organization.OrganizationRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Report.ReportRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Report.ReportRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Book.BookRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Book.BookRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Collection.CollectionRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Collection.CollectionRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Company.CompanyRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Company.CompanyRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Addressing.AddressingRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Addressing.AddressingRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Communication.CommunicationRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Communication.CommunicationRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Identification.IdentificationRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Identification.IdentificationRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Name.NameRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Name.NameRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GovernmentAgency.GovernmentAgencyRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GovernmentAgency.GovernmentAgencyRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Publisher.PublisherRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Publisher.PublisherRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator)this.getParent()).getARG_2000029();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentHasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentHasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingHasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingHasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Article.ArticleHasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Article.ArticleHasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BookSection.BookSectionHasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BookSection.BookSectionHasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Chapter.ChapterHasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Chapter.ChapterHasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartHasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartHasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Book.BookHasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Book.BookHasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperHasPublicationVenueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperHasPublicationVenueIterator)this.getParent()).getHasPublicationVenue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001PublicationVenueForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001PublicationVenueForIterator)this.getParent()).getPublicationVenueFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002PublicationVenueForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002PublicationVenueForIterator)this.getParent()).getPublicationVenueFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031PublicationVenueForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031PublicationVenueForIterator)this.getParent()).getPublicationVenueFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030PublicationVenueForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030PublicationVenueForIterator)this.getParent()).getPublicationVenueFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingPublicationVenueForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingPublicationVenueForIterator)this.getParent()).getPublicationVenueFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Collection.CollectionPublicationVenueForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Collection.CollectionPublicationVenueForIterator)this.getParent()).getPublicationVenueFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Journal.JournalPublicationVenueForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Journal.JournalPublicationVenueForIterator)this.getParent()).getPublicationVenueFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Periodical.PeriodicalPublicationVenueForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Periodical.PeriodicalPublicationVenueForIterator)this.getParent()).getPublicationVenueFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Book.BookPublicationVenueForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Book.BookPublicationVenueForIterator)this.getParent()).getPublicationVenueFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentPublicationVenueForIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentPublicationVenueForIterator)this.getParent()).getPublicationVenueFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentRO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentRO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Dataset.DatasetRO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Dataset.DatasetRO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Collection.CollectionRO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Collection.CollectionRO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Article.ArticleRO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Article.ArticleRO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRO_0002353Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRO_0002353Iterator)this.getParent()).getRO_0002353();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Article.ArticleRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Article.ArticleRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BookSection.BookSectionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BookSection.BookSectionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Addressing.AddressingRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Addressing.AddressingRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Communication.CommunicationRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Communication.CommunicationRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Identification.IdentificationRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Identification.IdentificationRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Name.NameRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Name.NameRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Report.ReportRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Report.ReportRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Book.BookRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Book.BookRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.URL.URLRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.URL.URLRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Area.AreaBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Area.AreaBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Self_governing.Self_governingBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Self_governing.Self_governingBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Territory.TerritoryBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Territory.TerritoryBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Country.CountryBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Country.CountryBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000050Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000050Iterator)this.getParent()).getBFO_0000050();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000050Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000050Iterator)this.getParent()).getBFO_0000050();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000050Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000050Iterator)this.getParent()).getBFO_0000050();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000050Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000050Iterator)this.getParent()).getBFO_0000050();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000050Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000050Iterator)this.getParent()).getBFO_0000050();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000050Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000050Iterator)this.getParent()).getBFO_0000050();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000050Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000050Iterator)this.getParent()).getBFO_0000050();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000050Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000050Iterator)this.getParent()).getBFO_0000050();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000050Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000050Iterator)this.getParent()).getBFO_0000050();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.StateOrProvince.StateOrProvinceBFO_0000050Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.StateOrProvince.StateOrProvinceBFO_0000050Iterator)this.getParent()).getBFO_0000050();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000050Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000050Iterator)this.getParent()).getBFO_0000050();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingHasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingHasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentHasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentHasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Article.ArticleHasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Article.ArticleHasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003HasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003HasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015HasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015HasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Event.EventHasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Event.EventHasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BookSection.BookSectionHasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BookSection.BookSectionHasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Chapter.ChapterHasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Chapter.ChapterHasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Conference.ConferenceHasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Conference.ConferenceHasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartHasSubjectAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartHasSubjectAreaIterator)this.getParent()).getHasSubjectArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Person.PersonOrcidIdIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Person.PersonOrcidIdIterator)this.getParent()).getOrcidId();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionGeographicFocusOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionGeographicFocusOfIterator)this.getParent()).getGeographicFocusOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingResearchAreaOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingResearchAreaOfIterator)this.getParent()).getResearchAreaOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Concept.ConceptResearchAreaOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Concept.ConceptResearchAreaOfIterator)this.getParent()).getResearchAreaOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasResearchAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasResearchAreaIterator)this.getParent()).getHasResearchArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasResearchAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasResearchAreaIterator)this.getParent()).getHasResearchArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004HasResearchAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004HasResearchAreaIterator)this.getParent()).getHasResearchArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingHasResearchAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingHasResearchAreaIterator)this.getParent()).getHasResearchArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Agent.AgentHasResearchAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Agent.AgentHasResearchAreaIterator)this.getParent()).getHasResearchArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Person.PersonHasResearchAreaIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Person.PersonHasResearchAreaIterator)this.getParent()).getHasResearchArea();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DateTimeInterval.DateTimeIntervalDateTimeIntervalInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DateTimeInterval.DateTimeIntervalDateTimeIntervalInverseIterator)this.getParent()).getDateTimeIntervalInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.URL.URLHasURLInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.URL.URLHasURLInverseIterator)this.getParent()).getHasURLInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Name.NameHasNameInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Name.NameHasNameInverseIterator)this.getParent()).getHasNameInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateTimeValueInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateTimeValueInverseIterator)this.getParent()).getDateTimeValueInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Telephone.TelephoneHasTelephoneInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Telephone.TelephoneHasTelephoneInverseIterator)this.getParent()).getHasTelephoneInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Email.EmailHasEmailInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Email.EmailHasEmailInverseIterator)this.getParent()).getHasEmailInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Title.TitleHasTitleInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Title.TitleHasTitleInverseIterator)this.getParent()).getHasTitleInverse();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingSubjectAreaOfIterator theThingSubjectAreaOfIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingSubjectAreaOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingSubjectAreaOfIterator.class);

			if (subjectURI == null && theThingSubjectAreaOfIterator != null) {
				subjectURI = theThingSubjectAreaOfIterator.getSubjectAreaOf();
			}

			edu.uiowa.slis.VIVOISF.Concept.ConceptSubjectAreaOfIterator theConceptSubjectAreaOfIterator = (edu.uiowa.slis.VIVOISF.Concept.ConceptSubjectAreaOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Concept.ConceptSubjectAreaOfIterator.class);

			if (subjectURI == null && theConceptSubjectAreaOfIterator != null) {
				subjectURI = theConceptSubjectAreaOfIterator.getSubjectAreaOf();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0001025Iterator theBFO_0000001RO_0001025Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0001025Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0001025Iterator.class);

			if (subjectURI == null && theBFO_0000001RO_0001025Iterator != null) {
				subjectURI = theBFO_0000001RO_0001025Iterator.getRO_0001025();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0001025Iterator theBFO_0000002RO_0001025Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0001025Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0001025Iterator.class);

			if (subjectURI == null && theBFO_0000002RO_0001025Iterator != null) {
				subjectURI = theBFO_0000002RO_0001025Iterator.getRO_0001025();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0001025Iterator theBFO_0000004RO_0001025Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0001025Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0001025Iterator.class);

			if (subjectURI == null && theBFO_0000004RO_0001025Iterator != null) {
				subjectURI = theBFO_0000004RO_0001025Iterator.getRO_0001025();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingRO_0001025Iterator theThingRO_0001025Iterator = (edu.uiowa.slis.VIVOISF.Thing.ThingRO_0001025Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingRO_0001025Iterator.class);

			if (subjectURI == null && theThingRO_0001025Iterator != null) {
				subjectURI = theThingRO_0001025Iterator.getRO_0001025();
			}

			edu.uiowa.slis.VIVOISF.Agent.AgentRO_0001025Iterator theAgentRO_0001025Iterator = (edu.uiowa.slis.VIVOISF.Agent.AgentRO_0001025Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Agent.AgentRO_0001025Iterator.class);

			if (subjectURI == null && theAgentRO_0001025Iterator != null) {
				subjectURI = theAgentRO_0001025Iterator.getRO_0001025();
			}

			edu.uiowa.slis.VIVOISF.Person.PersonRO_0001025Iterator thePersonRO_0001025Iterator = (edu.uiowa.slis.VIVOISF.Person.PersonRO_0001025Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Person.PersonRO_0001025Iterator.class);

			if (subjectURI == null && thePersonRO_0001025Iterator != null) {
				subjectURI = thePersonRO_0001025Iterator.getRO_0001025();
			}

			edu.uiowa.slis.VIVOISF.Area.AreaRO_0001015Iterator theAreaRO_0001015Iterator = (edu.uiowa.slis.VIVOISF.Area.AreaRO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Area.AreaRO_0001015Iterator.class);

			if (subjectURI == null && theAreaRO_0001015Iterator != null) {
				subjectURI = theAreaRO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.Self_governing.Self_governingRO_0001015Iterator theSelf_governingRO_0001015Iterator = (edu.uiowa.slis.VIVOISF.Self_governing.Self_governingRO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Self_governing.Self_governingRO_0001015Iterator.class);

			if (subjectURI == null && theSelf_governingRO_0001015Iterator != null) {
				subjectURI = theSelf_governingRO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.Territory.TerritoryRO_0001015Iterator theTerritoryRO_0001015Iterator = (edu.uiowa.slis.VIVOISF.Territory.TerritoryRO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Territory.TerritoryRO_0001015Iterator.class);

			if (subjectURI == null && theTerritoryRO_0001015Iterator != null) {
				subjectURI = theTerritoryRO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0001015Iterator theBFO_0000001RO_0001015Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0001015Iterator.class);

			if (subjectURI == null && theBFO_0000001RO_0001015Iterator != null) {
				subjectURI = theBFO_0000001RO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0001015Iterator theBFO_0000002RO_0001015Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0001015Iterator.class);

			if (subjectURI == null && theBFO_0000002RO_0001015Iterator != null) {
				subjectURI = theBFO_0000002RO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0001015Iterator theBFO_0000004RO_0001015Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0001015Iterator.class);

			if (subjectURI == null && theBFO_0000004RO_0001015Iterator != null) {
				subjectURI = theBFO_0000004RO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006RO_0001015Iterator theBFO_0000006RO_0001015Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006RO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006RO_0001015Iterator.class);

			if (subjectURI == null && theBFO_0000006RO_0001015Iterator != null) {
				subjectURI = theBFO_0000006RO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141RO_0001015Iterator theBFO_0000141RO_0001015Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141RO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141RO_0001015Iterator.class);

			if (subjectURI == null && theBFO_0000141RO_0001015Iterator != null) {
				subjectURI = theBFO_0000141RO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.Country.CountryRO_0001015Iterator theCountryRO_0001015Iterator = (edu.uiowa.slis.VIVOISF.Country.CountryRO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Country.CountryRO_0001015Iterator.class);

			if (subjectURI == null && theCountryRO_0001015Iterator != null) {
				subjectURI = theCountryRO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationRO_0001015Iterator theGeographicLocationRO_0001015Iterator = (edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationRO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationRO_0001015Iterator.class);

			if (subjectURI == null && theGeographicLocationRO_0001015Iterator != null) {
				subjectURI = theGeographicLocationRO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionRO_0001015Iterator theGeographicRegionRO_0001015Iterator = (edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionRO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionRO_0001015Iterator.class);

			if (subjectURI == null && theGeographicRegionRO_0001015Iterator != null) {
				subjectURI = theGeographicRegionRO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityRO_0001015Iterator theGeopoliticalEntityRO_0001015Iterator = (edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityRO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityRO_0001015Iterator.class);

			if (subjectURI == null && theGeopoliticalEntityRO_0001015Iterator != null) {
				subjectURI = theGeopoliticalEntityRO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.Location.LocationRO_0001015Iterator theLocationRO_0001015Iterator = (edu.uiowa.slis.VIVOISF.Location.LocationRO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Location.LocationRO_0001015Iterator.class);

			if (subjectURI == null && theLocationRO_0001015Iterator != null) {
				subjectURI = theLocationRO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingRO_0001015Iterator theThingRO_0001015Iterator = (edu.uiowa.slis.VIVOISF.Thing.ThingRO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingRO_0001015Iterator.class);

			if (subjectURI == null && theThingRO_0001015Iterator != null) {
				subjectURI = theThingRO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002234Iterator theBFO_0000001RO_0002234Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002234Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002234Iterator.class);

			if (subjectURI == null && theBFO_0000001RO_0002234Iterator != null) {
				subjectURI = theBFO_0000001RO_0002234Iterator.getRO_0002234();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003RO_0002234Iterator theBFO_0000003RO_0002234Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003RO_0002234Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003RO_0002234Iterator.class);

			if (subjectURI == null && theBFO_0000003RO_0002234Iterator != null) {
				subjectURI = theBFO_0000003RO_0002234Iterator.getRO_0002234();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015RO_0002234Iterator theBFO_0000015RO_0002234Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015RO_0002234Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015RO_0002234Iterator.class);

			if (subjectURI == null && theBFO_0000015RO_0002234Iterator != null) {
				subjectURI = theBFO_0000015RO_0002234Iterator.getRO_0002234();
			}

			edu.uiowa.slis.VIVOISF.Event.EventRO_0002234Iterator theEventRO_0002234Iterator = (edu.uiowa.slis.VIVOISF.Event.EventRO_0002234Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Event.EventRO_0002234Iterator.class);

			if (subjectURI == null && theEventRO_0002234Iterator != null) {
				subjectURI = theEventRO_0002234Iterator.getRO_0002234();
			}

			edu.uiowa.slis.VIVOISF.Conference.ConferenceRO_0002234Iterator theConferenceRO_0002234Iterator = (edu.uiowa.slis.VIVOISF.Conference.ConferenceRO_0002234Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Conference.ConferenceRO_0002234Iterator.class);

			if (subjectURI == null && theConferenceRO_0002234Iterator != null) {
				subjectURI = theConferenceRO_0002234Iterator.getRO_0002234();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002234Iterator theThingRO_0002234Iterator = (edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002234Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002234Iterator.class);

			if (subjectURI == null && theThingRO_0002234Iterator != null) {
				subjectURI = theThingRO_0002234Iterator.getRO_0002234();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatedByIterator theBFO_0000001RelatedByIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatedByIterator.class);

			if (subjectURI == null && theBFO_0000001RelatedByIterator != null) {
				subjectURI = theBFO_0000001RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatedByIterator theBFO_0000002RelatedByIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatedByIterator.class);

			if (subjectURI == null && theBFO_0000002RelatedByIterator != null) {
				subjectURI = theBFO_0000002RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingRelatedByIterator theThingRelatedByIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingRelatedByIterator.class);

			if (subjectURI == null && theThingRelatedByIterator != null) {
				subjectURI = theThingRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatedByIterator theBFO_0000031RelatedByIterator = (edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatedByIterator.class);

			if (subjectURI == null && theBFO_0000031RelatedByIterator != null) {
				subjectURI = theBFO_0000031RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatedByIterator theIAO_0000030RelatedByIterator = (edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatedByIterator.class);

			if (subjectURI == null && theIAO_0000030RelatedByIterator != null) {
				subjectURI = theIAO_0000030RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentRelatedByIterator theDocumentRelatedByIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentRelatedByIterator.class);

			if (subjectURI == null && theDocumentRelatedByIterator != null) {
				subjectURI = theDocumentRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Article.ArticleRelatedByIterator theArticleRelatedByIterator = (edu.uiowa.slis.VIVOISF.Article.ArticleRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Article.ArticleRelatedByIterator.class);

			if (subjectURI == null && theArticleRelatedByIterator != null) {
				subjectURI = theArticleRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Individual.IndividualRelatedByIterator theIndividualRelatedByIterator = (edu.uiowa.slis.VIVOISF.Individual.IndividualRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Individual.IndividualRelatedByIterator.class);

			if (subjectURI == null && theIndividualRelatedByIterator != null) {
				subjectURI = theIndividualRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatedByIterator theARG_2000379RelatedByIterator = (edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatedByIterator.class);

			if (subjectURI == null && theARG_2000379RelatedByIterator != null) {
				subjectURI = theARG_2000379RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Kind.KindRelatedByIterator theKindRelatedByIterator = (edu.uiowa.slis.VIVOISF.Kind.KindRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Kind.KindRelatedByIterator.class);

			if (subjectURI == null && theKindRelatedByIterator != null) {
				subjectURI = theKindRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator theAcademicArticleRelatedByIterator = (edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator.class);

			if (subjectURI == null && theAcademicArticleRelatedByIterator != null) {
				subjectURI = theAcademicArticleRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RelatedByIterator theBFO_0000004RelatedByIterator = (edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RelatedByIterator.class);

			if (subjectURI == null && theBFO_0000004RelatedByIterator != null) {
				subjectURI = theBFO_0000004RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Agent.AgentRelatedByIterator theAgentRelatedByIterator = (edu.uiowa.slis.VIVOISF.Agent.AgentRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Agent.AgentRelatedByIterator.class);

			if (subjectURI == null && theAgentRelatedByIterator != null) {
				subjectURI = theAgentRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator thePersonRelatedByIterator = (edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator.class);

			if (subjectURI == null && thePersonRelatedByIterator != null) {
				subjectURI = thePersonRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatedByIterator theBFO_0000017RelatedByIterator = (edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatedByIterator.class);

			if (subjectURI == null && theBFO_0000017RelatedByIterator != null) {
				subjectURI = theBFO_0000017RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatedByIterator theBFO_0000020RelatedByIterator = (edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatedByIterator.class);

			if (subjectURI == null && theBFO_0000020RelatedByIterator != null) {
				subjectURI = theBFO_0000020RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatedByIterator theBFO_0000023RelatedByIterator = (edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatedByIterator.class);

			if (subjectURI == null && theBFO_0000023RelatedByIterator != null) {
				subjectURI = theBFO_0000023RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator theConferencePaperRelatedByIterator = (edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator.class);

			if (subjectURI == null && theConferencePaperRelatedByIterator != null) {
				subjectURI = theConferencePaperRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatedByIterator theDatasetRelatedByIterator = (edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatedByIterator.class);

			if (subjectURI == null && theDatasetRelatedByIterator != null) {
				subjectURI = theDatasetRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.BookSection.BookSectionRelatedByIterator theBookSectionRelatedByIterator = (edu.uiowa.slis.VIVOISF.BookSection.BookSectionRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BookSection.BookSectionRelatedByIterator.class);

			if (subjectURI == null && theBookSectionRelatedByIterator != null) {
				subjectURI = theBookSectionRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatedByIterator theChapterRelatedByIterator = (edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatedByIterator.class);

			if (subjectURI == null && theChapterRelatedByIterator != null) {
				subjectURI = theChapterRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartRelatedByIterator theDocumentPartRelatedByIterator = (edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartRelatedByIterator.class);

			if (subjectURI == null && theDocumentPartRelatedByIterator != null) {
				subjectURI = theDocumentPartRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatedByIterator theConferencePosterRelatedByIterator = (edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatedByIterator.class);

			if (subjectURI == null && theConferencePosterRelatedByIterator != null) {
				subjectURI = theConferencePosterRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRelatedByIterator theSlideshowRelatedByIterator = (edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRelatedByIterator.class);

			if (subjectURI == null && theSlideshowRelatedByIterator != null) {
				subjectURI = theSlideshowRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Organization.OrganizationRelatedByIterator theOrganizationRelatedByIterator = (edu.uiowa.slis.VIVOISF.Organization.OrganizationRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Organization.OrganizationRelatedByIterator.class);

			if (subjectURI == null && theOrganizationRelatedByIterator != null) {
				subjectURI = theOrganizationRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Report.ReportRelatedByIterator theReportRelatedByIterator = (edu.uiowa.slis.VIVOISF.Report.ReportRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Report.ReportRelatedByIterator.class);

			if (subjectURI == null && theReportRelatedByIterator != null) {
				subjectURI = theReportRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Book.BookRelatedByIterator theBookRelatedByIterator = (edu.uiowa.slis.VIVOISF.Book.BookRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Book.BookRelatedByIterator.class);

			if (subjectURI == null && theBookRelatedByIterator != null) {
				subjectURI = theBookRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Collection.CollectionRelatedByIterator theCollectionRelatedByIterator = (edu.uiowa.slis.VIVOISF.Collection.CollectionRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Collection.CollectionRelatedByIterator.class);

			if (subjectURI == null && theCollectionRelatedByIterator != null) {
				subjectURI = theCollectionRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Company.CompanyRelatedByIterator theCompanyRelatedByIterator = (edu.uiowa.slis.VIVOISF.Company.CompanyRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Company.CompanyRelatedByIterator.class);

			if (subjectURI == null && theCompanyRelatedByIterator != null) {
				subjectURI = theCompanyRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Addressing.AddressingRelatedByIterator theAddressingRelatedByIterator = (edu.uiowa.slis.VIVOISF.Addressing.AddressingRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Addressing.AddressingRelatedByIterator.class);

			if (subjectURI == null && theAddressingRelatedByIterator != null) {
				subjectURI = theAddressingRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Communication.CommunicationRelatedByIterator theCommunicationRelatedByIterator = (edu.uiowa.slis.VIVOISF.Communication.CommunicationRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Communication.CommunicationRelatedByIterator.class);

			if (subjectURI == null && theCommunicationRelatedByIterator != null) {
				subjectURI = theCommunicationRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryRelatedByIterator theExplanatoryRelatedByIterator = (edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryRelatedByIterator.class);

			if (subjectURI == null && theExplanatoryRelatedByIterator != null) {
				subjectURI = theExplanatoryRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Identification.IdentificationRelatedByIterator theIdentificationRelatedByIterator = (edu.uiowa.slis.VIVOISF.Identification.IdentificationRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Identification.IdentificationRelatedByIterator.class);

			if (subjectURI == null && theIdentificationRelatedByIterator != null) {
				subjectURI = theIdentificationRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Name.NameRelatedByIterator theNameRelatedByIterator = (edu.uiowa.slis.VIVOISF.Name.NameRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Name.NameRelatedByIterator.class);

			if (subjectURI == null && theNameRelatedByIterator != null) {
				subjectURI = theNameRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRelatedByIterator theAudioVisualDocumentRelatedByIterator = (edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRelatedByIterator.class);

			if (subjectURI == null && theAudioVisualDocumentRelatedByIterator != null) {
				subjectURI = theAudioVisualDocumentRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatedByIterator theAuthorshipRelatedByIterator = (edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatedByIterator.class);

			if (subjectURI == null && theAuthorshipRelatedByIterator != null) {
				subjectURI = theAuthorshipRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.GovernmentAgency.GovernmentAgencyRelatedByIterator theGovernmentAgencyRelatedByIterator = (edu.uiowa.slis.VIVOISF.GovernmentAgency.GovernmentAgencyRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GovernmentAgency.GovernmentAgencyRelatedByIterator.class);

			if (subjectURI == null && theGovernmentAgencyRelatedByIterator != null) {
				subjectURI = theGovernmentAgencyRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatedByIterator theRelationshipRelatedByIterator = (edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatedByIterator.class);

			if (subjectURI == null && theRelationshipRelatedByIterator != null) {
				subjectURI = theRelationshipRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Publisher.PublisherRelatedByIterator thePublisherRelatedByIterator = (edu.uiowa.slis.VIVOISF.Publisher.PublisherRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Publisher.PublisherRelatedByIterator.class);

			if (subjectURI == null && thePublisherRelatedByIterator != null) {
				subjectURI = thePublisherRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator theARG_2000379ARG_2000029Iterator = (edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator.class);

			if (subjectURI == null && theARG_2000379ARG_2000029Iterator != null) {
				subjectURI = theARG_2000379ARG_2000029Iterator.getARG_2000029();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasPublicationVenueIterator theBFO_0000001HasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasPublicationVenueIterator.class);

			if (subjectURI == null && theBFO_0000001HasPublicationVenueIterator != null) {
				subjectURI = theBFO_0000001HasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasPublicationVenueIterator theBFO_0000002HasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasPublicationVenueIterator.class);

			if (subjectURI == null && theBFO_0000002HasPublicationVenueIterator != null) {
				subjectURI = theBFO_0000002HasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasPublicationVenueIterator theBFO_0000031HasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasPublicationVenueIterator.class);

			if (subjectURI == null && theBFO_0000031HasPublicationVenueIterator != null) {
				subjectURI = theBFO_0000031HasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasPublicationVenueIterator theIAO_0000030HasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasPublicationVenueIterator.class);

			if (subjectURI == null && theIAO_0000030HasPublicationVenueIterator != null) {
				subjectURI = theIAO_0000030HasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentHasPublicationVenueIterator theDocumentHasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentHasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentHasPublicationVenueIterator.class);

			if (subjectURI == null && theDocumentHasPublicationVenueIterator != null) {
				subjectURI = theDocumentHasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingHasPublicationVenueIterator theThingHasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingHasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingHasPublicationVenueIterator.class);

			if (subjectURI == null && theThingHasPublicationVenueIterator != null) {
				subjectURI = theThingHasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.Article.ArticleHasPublicationVenueIterator theArticleHasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.Article.ArticleHasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Article.ArticleHasPublicationVenueIterator.class);

			if (subjectURI == null && theArticleHasPublicationVenueIterator != null) {
				subjectURI = theArticleHasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasPublicationVenueIterator theAcademicArticleHasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasPublicationVenueIterator.class);

			if (subjectURI == null && theAcademicArticleHasPublicationVenueIterator != null) {
				subjectURI = theAcademicArticleHasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.BookSection.BookSectionHasPublicationVenueIterator theBookSectionHasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.BookSection.BookSectionHasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BookSection.BookSectionHasPublicationVenueIterator.class);

			if (subjectURI == null && theBookSectionHasPublicationVenueIterator != null) {
				subjectURI = theBookSectionHasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.Chapter.ChapterHasPublicationVenueIterator theChapterHasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.Chapter.ChapterHasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Chapter.ChapterHasPublicationVenueIterator.class);

			if (subjectURI == null && theChapterHasPublicationVenueIterator != null) {
				subjectURI = theChapterHasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartHasPublicationVenueIterator theDocumentPartHasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartHasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartHasPublicationVenueIterator.class);

			if (subjectURI == null && theDocumentPartHasPublicationVenueIterator != null) {
				subjectURI = theDocumentPartHasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.Book.BookHasPublicationVenueIterator theBookHasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.Book.BookHasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Book.BookHasPublicationVenueIterator.class);

			if (subjectURI == null && theBookHasPublicationVenueIterator != null) {
				subjectURI = theBookHasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperHasPublicationVenueIterator theConferencePaperHasPublicationVenueIterator = (edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperHasPublicationVenueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperHasPublicationVenueIterator.class);

			if (subjectURI == null && theConferencePaperHasPublicationVenueIterator != null) {
				subjectURI = theConferencePaperHasPublicationVenueIterator.getHasPublicationVenue();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001PublicationVenueForIterator theBFO_0000001PublicationVenueForIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001PublicationVenueForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001PublicationVenueForIterator.class);

			if (subjectURI == null && theBFO_0000001PublicationVenueForIterator != null) {
				subjectURI = theBFO_0000001PublicationVenueForIterator.getPublicationVenueFor();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002PublicationVenueForIterator theBFO_0000002PublicationVenueForIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002PublicationVenueForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002PublicationVenueForIterator.class);

			if (subjectURI == null && theBFO_0000002PublicationVenueForIterator != null) {
				subjectURI = theBFO_0000002PublicationVenueForIterator.getPublicationVenueFor();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031PublicationVenueForIterator theBFO_0000031PublicationVenueForIterator = (edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031PublicationVenueForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031PublicationVenueForIterator.class);

			if (subjectURI == null && theBFO_0000031PublicationVenueForIterator != null) {
				subjectURI = theBFO_0000031PublicationVenueForIterator.getPublicationVenueFor();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030PublicationVenueForIterator theIAO_0000030PublicationVenueForIterator = (edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030PublicationVenueForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030PublicationVenueForIterator.class);

			if (subjectURI == null && theIAO_0000030PublicationVenueForIterator != null) {
				subjectURI = theIAO_0000030PublicationVenueForIterator.getPublicationVenueFor();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingPublicationVenueForIterator theThingPublicationVenueForIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingPublicationVenueForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingPublicationVenueForIterator.class);

			if (subjectURI == null && theThingPublicationVenueForIterator != null) {
				subjectURI = theThingPublicationVenueForIterator.getPublicationVenueFor();
			}

			edu.uiowa.slis.VIVOISF.Collection.CollectionPublicationVenueForIterator theCollectionPublicationVenueForIterator = (edu.uiowa.slis.VIVOISF.Collection.CollectionPublicationVenueForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Collection.CollectionPublicationVenueForIterator.class);

			if (subjectURI == null && theCollectionPublicationVenueForIterator != null) {
				subjectURI = theCollectionPublicationVenueForIterator.getPublicationVenueFor();
			}

			edu.uiowa.slis.VIVOISF.Journal.JournalPublicationVenueForIterator theJournalPublicationVenueForIterator = (edu.uiowa.slis.VIVOISF.Journal.JournalPublicationVenueForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Journal.JournalPublicationVenueForIterator.class);

			if (subjectURI == null && theJournalPublicationVenueForIterator != null) {
				subjectURI = theJournalPublicationVenueForIterator.getPublicationVenueFor();
			}

			edu.uiowa.slis.VIVOISF.Periodical.PeriodicalPublicationVenueForIterator thePeriodicalPublicationVenueForIterator = (edu.uiowa.slis.VIVOISF.Periodical.PeriodicalPublicationVenueForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Periodical.PeriodicalPublicationVenueForIterator.class);

			if (subjectURI == null && thePeriodicalPublicationVenueForIterator != null) {
				subjectURI = thePeriodicalPublicationVenueForIterator.getPublicationVenueFor();
			}

			edu.uiowa.slis.VIVOISF.Book.BookPublicationVenueForIterator theBookPublicationVenueForIterator = (edu.uiowa.slis.VIVOISF.Book.BookPublicationVenueForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Book.BookPublicationVenueForIterator.class);

			if (subjectURI == null && theBookPublicationVenueForIterator != null) {
				subjectURI = theBookPublicationVenueForIterator.getPublicationVenueFor();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentPublicationVenueForIterator theDocumentPublicationVenueForIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentPublicationVenueForIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentPublicationVenueForIterator.class);

			if (subjectURI == null && theDocumentPublicationVenueForIterator != null) {
				subjectURI = theDocumentPublicationVenueForIterator.getPublicationVenueFor();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002353Iterator theBFO_0000001RO_0002353Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0002353Iterator.class);

			if (subjectURI == null && theBFO_0000001RO_0002353Iterator != null) {
				subjectURI = theBFO_0000001RO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0002353Iterator theBFO_0000002RO_0002353Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0002353Iterator.class);

			if (subjectURI == null && theBFO_0000002RO_0002353Iterator != null) {
				subjectURI = theBFO_0000002RO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RO_0002353Iterator theBFO_0000031RO_0002353Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RO_0002353Iterator.class);

			if (subjectURI == null && theBFO_0000031RO_0002353Iterator != null) {
				subjectURI = theBFO_0000031RO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RO_0002353Iterator theIAO_0000030RO_0002353Iterator = (edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RO_0002353Iterator.class);

			if (subjectURI == null && theIAO_0000030RO_0002353Iterator != null) {
				subjectURI = theIAO_0000030RO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002353Iterator theThingRO_0002353Iterator = (edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingRO_0002353Iterator.class);

			if (subjectURI == null && theThingRO_0002353Iterator != null) {
				subjectURI = theThingRO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentRO_0002353Iterator theDocumentRO_0002353Iterator = (edu.uiowa.slis.VIVOISF.Document.DocumentRO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentRO_0002353Iterator.class);

			if (subjectURI == null && theDocumentRO_0002353Iterator != null) {
				subjectURI = theDocumentRO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRO_0002353Iterator theSlideshowRO_0002353Iterator = (edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRO_0002353Iterator.class);

			if (subjectURI == null && theSlideshowRO_0002353Iterator != null) {
				subjectURI = theSlideshowRO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRO_0002353Iterator theConferencePosterRO_0002353Iterator = (edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRO_0002353Iterator.class);

			if (subjectURI == null && theConferencePosterRO_0002353Iterator != null) {
				subjectURI = theConferencePosterRO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.Dataset.DatasetRO_0002353Iterator theDatasetRO_0002353Iterator = (edu.uiowa.slis.VIVOISF.Dataset.DatasetRO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Dataset.DatasetRO_0002353Iterator.class);

			if (subjectURI == null && theDatasetRO_0002353Iterator != null) {
				subjectURI = theDatasetRO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.Collection.CollectionRO_0002353Iterator theCollectionRO_0002353Iterator = (edu.uiowa.slis.VIVOISF.Collection.CollectionRO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Collection.CollectionRO_0002353Iterator.class);

			if (subjectURI == null && theCollectionRO_0002353Iterator != null) {
				subjectURI = theCollectionRO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRO_0002353Iterator theAudioVisualDocumentRO_0002353Iterator = (edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRO_0002353Iterator.class);

			if (subjectURI == null && theAudioVisualDocumentRO_0002353Iterator != null) {
				subjectURI = theAudioVisualDocumentRO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.Article.ArticleRO_0002353Iterator theArticleRO_0002353Iterator = (edu.uiowa.slis.VIVOISF.Article.ArticleRO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Article.ArticleRO_0002353Iterator.class);

			if (subjectURI == null && theArticleRO_0002353Iterator != null) {
				subjectURI = theArticleRO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRO_0002353Iterator theConferencePaperRO_0002353Iterator = (edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRO_0002353Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRO_0002353Iterator.class);

			if (subjectURI == null && theConferencePaperRO_0002353Iterator != null) {
				subjectURI = theConferencePaperRO_0002353Iterator.getRO_0002353();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator theBFO_0000001RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator.class);

			if (subjectURI == null && theBFO_0000001RelatesIterator != null) {
				subjectURI = theBFO_0000001RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator theBFO_0000002RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator.class);

			if (subjectURI == null && theBFO_0000002RelatesIterator != null) {
				subjectURI = theBFO_0000002RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator theThingRelatesIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator.class);

			if (subjectURI == null && theThingRelatesIterator != null) {
				subjectURI = theThingRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator theBFO_0000020RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator.class);

			if (subjectURI == null && theBFO_0000020RelatesIterator != null) {
				subjectURI = theBFO_0000020RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator theRelationshipRelatesIterator = (edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator.class);

			if (subjectURI == null && theRelationshipRelatesIterator != null) {
				subjectURI = theRelationshipRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator theAuthorshipRelatesIterator = (edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator.class);

			if (subjectURI == null && theAuthorshipRelatesIterator != null) {
				subjectURI = theAuthorshipRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatesIterator theBFO_0000031RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatesIterator.class);

			if (subjectURI == null && theBFO_0000031RelatesIterator != null) {
				subjectURI = theBFO_0000031RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatesIterator theIAO_0000030RelatesIterator = (edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatesIterator.class);

			if (subjectURI == null && theIAO_0000030RelatesIterator != null) {
				subjectURI = theIAO_0000030RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentRelatesIterator theDocumentRelatesIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentRelatesIterator.class);

			if (subjectURI == null && theDocumentRelatesIterator != null) {
				subjectURI = theDocumentRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Article.ArticleRelatesIterator theArticleRelatesIterator = (edu.uiowa.slis.VIVOISF.Article.ArticleRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Article.ArticleRelatesIterator.class);

			if (subjectURI == null && theArticleRelatesIterator != null) {
				subjectURI = theArticleRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatesIterator theAcademicArticleRelatesIterator = (edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatesIterator.class);

			if (subjectURI == null && theAcademicArticleRelatesIterator != null) {
				subjectURI = theAcademicArticleRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatesIterator theDatasetRelatesIterator = (edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatesIterator.class);

			if (subjectURI == null && theDatasetRelatesIterator != null) {
				subjectURI = theDatasetRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator thePositionRelatesIterator = (edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator.class);

			if (subjectURI == null && thePositionRelatesIterator != null) {
				subjectURI = thePositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.BookSection.BookSectionRelatesIterator theBookSectionRelatesIterator = (edu.uiowa.slis.VIVOISF.BookSection.BookSectionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BookSection.BookSectionRelatesIterator.class);

			if (subjectURI == null && theBookSectionRelatesIterator != null) {
				subjectURI = theBookSectionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatesIterator theChapterRelatesIterator = (edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatesIterator.class);

			if (subjectURI == null && theChapterRelatesIterator != null) {
				subjectURI = theChapterRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartRelatesIterator theDocumentPartRelatesIterator = (edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartRelatesIterator.class);

			if (subjectURI == null && theDocumentPartRelatesIterator != null) {
				subjectURI = theDocumentPartRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Addressing.AddressingRelatesIterator theAddressingRelatesIterator = (edu.uiowa.slis.VIVOISF.Addressing.AddressingRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Addressing.AddressingRelatesIterator.class);

			if (subjectURI == null && theAddressingRelatesIterator != null) {
				subjectURI = theAddressingRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Communication.CommunicationRelatesIterator theCommunicationRelatesIterator = (edu.uiowa.slis.VIVOISF.Communication.CommunicationRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Communication.CommunicationRelatesIterator.class);

			if (subjectURI == null && theCommunicationRelatesIterator != null) {
				subjectURI = theCommunicationRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryRelatesIterator theExplanatoryRelatesIterator = (edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryRelatesIterator.class);

			if (subjectURI == null && theExplanatoryRelatesIterator != null) {
				subjectURI = theExplanatoryRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Identification.IdentificationRelatesIterator theIdentificationRelatesIterator = (edu.uiowa.slis.VIVOISF.Identification.IdentificationRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Identification.IdentificationRelatesIterator.class);

			if (subjectURI == null && theIdentificationRelatesIterator != null) {
				subjectURI = theIdentificationRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Name.NameRelatesIterator theNameRelatesIterator = (edu.uiowa.slis.VIVOISF.Name.NameRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Name.NameRelatesIterator.class);

			if (subjectURI == null && theNameRelatesIterator != null) {
				subjectURI = theNameRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator theLibrarianPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator.class);

			if (subjectURI == null && theLibrarianPositionRelatesIterator != null) {
				subjectURI = theLibrarianPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator theNonAcademicPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator.class);

			if (subjectURI == null && theNonAcademicPositionRelatesIterator != null) {
				subjectURI = theNonAcademicPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator theFacultyPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator.class);

			if (subjectURI == null && theFacultyPositionRelatesIterator != null) {
				subjectURI = theFacultyPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatesIterator theConferencePaperRelatesIterator = (edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatesIterator.class);

			if (subjectURI == null && theConferencePaperRelatesIterator != null) {
				subjectURI = theConferencePaperRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator theEditorshipRelatesIterator = (edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator.class);

			if (subjectURI == null && theEditorshipRelatesIterator != null) {
				subjectURI = theEditorshipRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator theFacultyAdministrativePositionRelatesIterator = (edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator.class);

			if (subjectURI == null && theFacultyAdministrativePositionRelatesIterator != null) {
				subjectURI = theFacultyAdministrativePositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionRelatesIterator theNonFacultyAcademicPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionRelatesIterator.class);

			if (subjectURI == null && theNonFacultyAcademicPositionRelatesIterator != null) {
				subjectURI = theNonFacultyAcademicPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatesIterator theBFO_0000017RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatesIterator.class);

			if (subjectURI == null && theBFO_0000017RelatesIterator != null) {
				subjectURI = theBFO_0000017RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatesIterator theBFO_0000023RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatesIterator.class);

			if (subjectURI == null && theBFO_0000023RelatesIterator != null) {
				subjectURI = theBFO_0000023RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatesIterator theARG_2000379RelatesIterator = (edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatesIterator.class);

			if (subjectURI == null && theARG_2000379RelatesIterator != null) {
				subjectURI = theARG_2000379RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Report.ReportRelatesIterator theReportRelatesIterator = (edu.uiowa.slis.VIVOISF.Report.ReportRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Report.ReportRelatesIterator.class);

			if (subjectURI == null && theReportRelatesIterator != null) {
				subjectURI = theReportRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator thePrimaryPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator.class);

			if (subjectURI == null && thePrimaryPositionRelatesIterator != null) {
				subjectURI = thePrimaryPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator theKindRelatesIterator = (edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator.class);

			if (subjectURI == null && theKindRelatesIterator != null) {
				subjectURI = theKindRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Book.BookRelatesIterator theBookRelatesIterator = (edu.uiowa.slis.VIVOISF.Book.BookRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Book.BookRelatesIterator.class);

			if (subjectURI == null && theBookRelatesIterator != null) {
				subjectURI = theBookRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator thePostdocPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator.class);

			if (subjectURI == null && thePostdocPositionRelatesIterator != null) {
				subjectURI = thePostdocPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.URL.URLRelatesIterator theURLRelatesIterator = (edu.uiowa.slis.VIVOISF.URL.URLRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.URL.URLRelatesIterator.class);

			if (subjectURI == null && theURLRelatesIterator != null) {
				subjectURI = theURLRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatesIterator theConferencePosterRelatesIterator = (edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatesIterator.class);

			if (subjectURI == null && theConferencePosterRelatesIterator != null) {
				subjectURI = theConferencePosterRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Area.AreaBFO_0000051Iterator theAreaBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.Area.AreaBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Area.AreaBFO_0000051Iterator.class);

			if (subjectURI == null && theAreaBFO_0000051Iterator != null) {
				subjectURI = theAreaBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.Self_governing.Self_governingBFO_0000051Iterator theSelf_governingBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.Self_governing.Self_governingBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Self_governing.Self_governingBFO_0000051Iterator.class);

			if (subjectURI == null && theSelf_governingBFO_0000051Iterator != null) {
				subjectURI = theSelf_governingBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.Territory.TerritoryBFO_0000051Iterator theTerritoryBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.Territory.TerritoryBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Territory.TerritoryBFO_0000051Iterator.class);

			if (subjectURI == null && theTerritoryBFO_0000051Iterator != null) {
				subjectURI = theTerritoryBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000051Iterator theBFO_0000001BFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000051Iterator.class);

			if (subjectURI == null && theBFO_0000001BFO_0000051Iterator != null) {
				subjectURI = theBFO_0000001BFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000051Iterator theBFO_0000002BFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000051Iterator.class);

			if (subjectURI == null && theBFO_0000002BFO_0000051Iterator != null) {
				subjectURI = theBFO_0000002BFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000051Iterator theBFO_0000004BFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000051Iterator.class);

			if (subjectURI == null && theBFO_0000004BFO_0000051Iterator != null) {
				subjectURI = theBFO_0000004BFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000051Iterator theBFO_0000006BFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000051Iterator.class);

			if (subjectURI == null && theBFO_0000006BFO_0000051Iterator != null) {
				subjectURI = theBFO_0000006BFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000051Iterator theBFO_0000141BFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000051Iterator.class);

			if (subjectURI == null && theBFO_0000141BFO_0000051Iterator != null) {
				subjectURI = theBFO_0000141BFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.Country.CountryBFO_0000051Iterator theCountryBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.Country.CountryBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Country.CountryBFO_0000051Iterator.class);

			if (subjectURI == null && theCountryBFO_0000051Iterator != null) {
				subjectURI = theCountryBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000051Iterator theGeographicLocationBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000051Iterator.class);

			if (subjectURI == null && theGeographicLocationBFO_0000051Iterator != null) {
				subjectURI = theGeographicLocationBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000051Iterator theGeographicRegionBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000051Iterator.class);

			if (subjectURI == null && theGeographicRegionBFO_0000051Iterator != null) {
				subjectURI = theGeographicRegionBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000051Iterator theGeopoliticalEntityBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000051Iterator.class);

			if (subjectURI == null && theGeopoliticalEntityBFO_0000051Iterator != null) {
				subjectURI = theGeopoliticalEntityBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000051Iterator theLocationBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000051Iterator.class);

			if (subjectURI == null && theLocationBFO_0000051Iterator != null) {
				subjectURI = theLocationBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000051Iterator theThingBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000051Iterator.class);

			if (subjectURI == null && theThingBFO_0000051Iterator != null) {
				subjectURI = theThingBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000050Iterator theBFO_0000001BFO_0000050Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000050Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000050Iterator.class);

			if (subjectURI == null && theBFO_0000001BFO_0000050Iterator != null) {
				subjectURI = theBFO_0000001BFO_0000050Iterator.getBFO_0000050();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000050Iterator theBFO_0000002BFO_0000050Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000050Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000050Iterator.class);

			if (subjectURI == null && theBFO_0000002BFO_0000050Iterator != null) {
				subjectURI = theBFO_0000002BFO_0000050Iterator.getBFO_0000050();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000050Iterator theBFO_0000004BFO_0000050Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000050Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000050Iterator.class);

			if (subjectURI == null && theBFO_0000004BFO_0000050Iterator != null) {
				subjectURI = theBFO_0000004BFO_0000050Iterator.getBFO_0000050();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000050Iterator theBFO_0000006BFO_0000050Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000050Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000050Iterator.class);

			if (subjectURI == null && theBFO_0000006BFO_0000050Iterator != null) {
				subjectURI = theBFO_0000006BFO_0000050Iterator.getBFO_0000050();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000050Iterator theBFO_0000141BFO_0000050Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000050Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000050Iterator.class);

			if (subjectURI == null && theBFO_0000141BFO_0000050Iterator != null) {
				subjectURI = theBFO_0000141BFO_0000050Iterator.getBFO_0000050();
			}

			edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000050Iterator theGeographicLocationBFO_0000050Iterator = (edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000050Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000050Iterator.class);

			if (subjectURI == null && theGeographicLocationBFO_0000050Iterator != null) {
				subjectURI = theGeographicLocationBFO_0000050Iterator.getBFO_0000050();
			}

			edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000050Iterator theGeographicRegionBFO_0000050Iterator = (edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000050Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000050Iterator.class);

			if (subjectURI == null && theGeographicRegionBFO_0000050Iterator != null) {
				subjectURI = theGeographicRegionBFO_0000050Iterator.getBFO_0000050();
			}

			edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000050Iterator theGeopoliticalEntityBFO_0000050Iterator = (edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000050Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000050Iterator.class);

			if (subjectURI == null && theGeopoliticalEntityBFO_0000050Iterator != null) {
				subjectURI = theGeopoliticalEntityBFO_0000050Iterator.getBFO_0000050();
			}

			edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000050Iterator theLocationBFO_0000050Iterator = (edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000050Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000050Iterator.class);

			if (subjectURI == null && theLocationBFO_0000050Iterator != null) {
				subjectURI = theLocationBFO_0000050Iterator.getBFO_0000050();
			}

			edu.uiowa.slis.VIVOISF.StateOrProvince.StateOrProvinceBFO_0000050Iterator theStateOrProvinceBFO_0000050Iterator = (edu.uiowa.slis.VIVOISF.StateOrProvince.StateOrProvinceBFO_0000050Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.StateOrProvince.StateOrProvinceBFO_0000050Iterator.class);

			if (subjectURI == null && theStateOrProvinceBFO_0000050Iterator != null) {
				subjectURI = theStateOrProvinceBFO_0000050Iterator.getBFO_0000050();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000050Iterator theThingBFO_0000050Iterator = (edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000050Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000050Iterator.class);

			if (subjectURI == null && theThingBFO_0000050Iterator != null) {
				subjectURI = theThingBFO_0000050Iterator.getBFO_0000050();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasSubjectAreaIterator theBFO_0000001HasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasSubjectAreaIterator.class);

			if (subjectURI == null && theBFO_0000001HasSubjectAreaIterator != null) {
				subjectURI = theBFO_0000001HasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingHasSubjectAreaIterator theThingHasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingHasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingHasSubjectAreaIterator.class);

			if (subjectURI == null && theThingHasSubjectAreaIterator != null) {
				subjectURI = theThingHasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasSubjectAreaIterator theBFO_0000002HasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasSubjectAreaIterator.class);

			if (subjectURI == null && theBFO_0000002HasSubjectAreaIterator != null) {
				subjectURI = theBFO_0000002HasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasSubjectAreaIterator theBFO_0000031HasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasSubjectAreaIterator.class);

			if (subjectURI == null && theBFO_0000031HasSubjectAreaIterator != null) {
				subjectURI = theBFO_0000031HasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasSubjectAreaIterator theIAO_0000030HasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasSubjectAreaIterator.class);

			if (subjectURI == null && theIAO_0000030HasSubjectAreaIterator != null) {
				subjectURI = theIAO_0000030HasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentHasSubjectAreaIterator theDocumentHasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentHasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentHasSubjectAreaIterator.class);

			if (subjectURI == null && theDocumentHasSubjectAreaIterator != null) {
				subjectURI = theDocumentHasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasSubjectAreaIterator theAcademicArticleHasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleHasSubjectAreaIterator.class);

			if (subjectURI == null && theAcademicArticleHasSubjectAreaIterator != null) {
				subjectURI = theAcademicArticleHasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.Article.ArticleHasSubjectAreaIterator theArticleHasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.Article.ArticleHasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Article.ArticleHasSubjectAreaIterator.class);

			if (subjectURI == null && theArticleHasSubjectAreaIterator != null) {
				subjectURI = theArticleHasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003HasSubjectAreaIterator theBFO_0000003HasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003HasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003HasSubjectAreaIterator.class);

			if (subjectURI == null && theBFO_0000003HasSubjectAreaIterator != null) {
				subjectURI = theBFO_0000003HasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015HasSubjectAreaIterator theBFO_0000015HasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015HasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015HasSubjectAreaIterator.class);

			if (subjectURI == null && theBFO_0000015HasSubjectAreaIterator != null) {
				subjectURI = theBFO_0000015HasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.Event.EventHasSubjectAreaIterator theEventHasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.Event.EventHasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Event.EventHasSubjectAreaIterator.class);

			if (subjectURI == null && theEventHasSubjectAreaIterator != null) {
				subjectURI = theEventHasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.BookSection.BookSectionHasSubjectAreaIterator theBookSectionHasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.BookSection.BookSectionHasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BookSection.BookSectionHasSubjectAreaIterator.class);

			if (subjectURI == null && theBookSectionHasSubjectAreaIterator != null) {
				subjectURI = theBookSectionHasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.Chapter.ChapterHasSubjectAreaIterator theChapterHasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.Chapter.ChapterHasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Chapter.ChapterHasSubjectAreaIterator.class);

			if (subjectURI == null && theChapterHasSubjectAreaIterator != null) {
				subjectURI = theChapterHasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.Conference.ConferenceHasSubjectAreaIterator theConferenceHasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.Conference.ConferenceHasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Conference.ConferenceHasSubjectAreaIterator.class);

			if (subjectURI == null && theConferenceHasSubjectAreaIterator != null) {
				subjectURI = theConferenceHasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartHasSubjectAreaIterator theDocumentPartHasSubjectAreaIterator = (edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartHasSubjectAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartHasSubjectAreaIterator.class);

			if (subjectURI == null && theDocumentPartHasSubjectAreaIterator != null) {
				subjectURI = theDocumentPartHasSubjectAreaIterator.getHasSubjectArea();
			}

			edu.uiowa.slis.VIVOISF.Person.PersonOrcidIdIterator thePersonOrcidIdIterator = (edu.uiowa.slis.VIVOISF.Person.PersonOrcidIdIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Person.PersonOrcidIdIterator.class);

			if (subjectURI == null && thePersonOrcidIdIterator != null) {
				subjectURI = thePersonOrcidIdIterator.getOrcidId();
			}

			edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionGeographicFocusOfIterator theGeographicRegionGeographicFocusOfIterator = (edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionGeographicFocusOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionGeographicFocusOfIterator.class);

			if (subjectURI == null && theGeographicRegionGeographicFocusOfIterator != null) {
				subjectURI = theGeographicRegionGeographicFocusOfIterator.getGeographicFocusOf();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingResearchAreaOfIterator theThingResearchAreaOfIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingResearchAreaOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingResearchAreaOfIterator.class);

			if (subjectURI == null && theThingResearchAreaOfIterator != null) {
				subjectURI = theThingResearchAreaOfIterator.getResearchAreaOf();
			}

			edu.uiowa.slis.VIVOISF.Concept.ConceptResearchAreaOfIterator theConceptResearchAreaOfIterator = (edu.uiowa.slis.VIVOISF.Concept.ConceptResearchAreaOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Concept.ConceptResearchAreaOfIterator.class);

			if (subjectURI == null && theConceptResearchAreaOfIterator != null) {
				subjectURI = theConceptResearchAreaOfIterator.getResearchAreaOf();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasResearchAreaIterator theBFO_0000001HasResearchAreaIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasResearchAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasResearchAreaIterator.class);

			if (subjectURI == null && theBFO_0000001HasResearchAreaIterator != null) {
				subjectURI = theBFO_0000001HasResearchAreaIterator.getHasResearchArea();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasResearchAreaIterator theBFO_0000002HasResearchAreaIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasResearchAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasResearchAreaIterator.class);

			if (subjectURI == null && theBFO_0000002HasResearchAreaIterator != null) {
				subjectURI = theBFO_0000002HasResearchAreaIterator.getHasResearchArea();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004HasResearchAreaIterator theBFO_0000004HasResearchAreaIterator = (edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004HasResearchAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004HasResearchAreaIterator.class);

			if (subjectURI == null && theBFO_0000004HasResearchAreaIterator != null) {
				subjectURI = theBFO_0000004HasResearchAreaIterator.getHasResearchArea();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingHasResearchAreaIterator theThingHasResearchAreaIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingHasResearchAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingHasResearchAreaIterator.class);

			if (subjectURI == null && theThingHasResearchAreaIterator != null) {
				subjectURI = theThingHasResearchAreaIterator.getHasResearchArea();
			}

			edu.uiowa.slis.VIVOISF.Agent.AgentHasResearchAreaIterator theAgentHasResearchAreaIterator = (edu.uiowa.slis.VIVOISF.Agent.AgentHasResearchAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Agent.AgentHasResearchAreaIterator.class);

			if (subjectURI == null && theAgentHasResearchAreaIterator != null) {
				subjectURI = theAgentHasResearchAreaIterator.getHasResearchArea();
			}

			edu.uiowa.slis.VIVOISF.Person.PersonHasResearchAreaIterator thePersonHasResearchAreaIterator = (edu.uiowa.slis.VIVOISF.Person.PersonHasResearchAreaIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Person.PersonHasResearchAreaIterator.class);

			if (subjectURI == null && thePersonHasResearchAreaIterator != null) {
				subjectURI = thePersonHasResearchAreaIterator.getHasResearchArea();
			}

			if (theThingIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?labelUS ?labelENG ?label ?labelANY ?foafName ?schemaName ?rdfValue  ?PlaceOfPublication ?HideFromDisplay ?Abbreviation where {"
				+ "  OPTIONAL { SELECT ?labelUS  WHERE { <" + subjectURI + "> rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelENG WHERE { <" + subjectURI + "> rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?label    WHERE { <" + subjectURI + "> rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelANY WHERE { <" + subjectURI + "> rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#placeOfPublication> ?PlaceOfPublication } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#hideFromDisplay> ?HideFromDisplay } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#abbreviation> ?Abbreviation } "
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
					placeOfPublication = sol.get("?PlaceOfPublication") == null ? null : sol.get("?PlaceOfPublication").toString();
					hideFromDisplay = sol.get("?HideFromDisplay") == null ? null : sol.get("?HideFromDisplay").toString();
					abbreviation = sol.get("?Abbreviation") == null ? null : sol.get("?Abbreviation").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Thing doStartTag", e);
			throw new JspTagException("Exception raised in Thing doStartTag");
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
			log.error("Exception raised in Thing doEndTag", e);
			throw new JspTagException("Exception raised in Thing doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String theSubjectURI) {
		subjectURI = theSubjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String theLabel) {
		label = theLabel;
	}

	public String getLabel() {
		return label;
	}

	public void setPlaceOfPublication(String thePlaceOfPublication) {
		placeOfPublication = thePlaceOfPublication;
	}

	public String getPlaceOfPublication() {
		return placeOfPublication;
	}

	public void setHideFromDisplay(String theHideFromDisplay) {
		hideFromDisplay = theHideFromDisplay;
	}

	public String getHideFromDisplay() {
		return hideFromDisplay;
	}

	public void setAbbreviation(String theAbbreviation) {
		abbreviation = theAbbreviation;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

}
