package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Dataset extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Dataset currentInstance = null;
	private static final Log log = LogFactory.getLog(Dataset.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			DatasetIterator theDatasetIterator = (DatasetIterator) findAncestorWithClass(this, DatasetIterator.class);

			if (theDatasetIterator != null) {
				subjectURI = theDatasetIterator.getSubjectURI();
				label = theDatasetIterator.getLabel();
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

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatedByIterator)this.getParent()).getRelatedBy();
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

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator)this.getParent()).getARG_2000029();
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

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateTimeValueInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueDateTimeValueInverseIterator)this.getParent()).getDateTimeValueInverse();
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

			edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator theARG_2000379ARG_2000029Iterator = (edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator.class);

			if (subjectURI == null && theARG_2000379ARG_2000029Iterator != null) {
				subjectURI = theARG_2000379ARG_2000029Iterator.getARG_2000029();
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

			if (theDatasetIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Dataset doStartTag", e);
			throw new JspTagException("Exception raised in Dataset doStartTag");
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
			log.error("Exception raised in Dataset doEndTag", e);
			throw new JspTagException("Exception raised in Dataset doEndTag");
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

}
