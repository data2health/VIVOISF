package edu.uiowa.slis.VIVOISF.UndergraduateAdvisingRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

import java.util.Hashtable;

@SuppressWarnings("serial")
public class UndergraduateAdvisingRelationshipDegreeCandidacyIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateAdvisingRelationshipDegreeCandidacyIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateAdvisingRelationshipDegreeCandidacyIterator.class);

	String subjectURI = null;
	String type = null;
	String degreeCandidacy = null;
	ResultSet rs = null;
	Hashtable<String,String> classFilter = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			UndergraduateAdvisingRelationship theUndergraduateAdvisingRelationship = (UndergraduateAdvisingRelationship) findAncestorWithClass(this, UndergraduateAdvisingRelationship.class);

			if (theUndergraduateAdvisingRelationship != null) {
				subjectURI = theUndergraduateAdvisingRelationship.getSubjectURI();
			}

			if (theUndergraduateAdvisingRelationship == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://vivoweb.org/ontology/core#degreeCandidacy> ?s . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				degreeCandidacy = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (classFilter == null || (classFilter != null && classFilter.containsKey(type))) {
					log.info("instance: " + degreeCandidacy + "	type: " + type);
					return EVAL_BODY_INCLUDE;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in UndergraduateAdvisingRelationshipDegreeCandidacyIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in UndergraduateAdvisingRelationshipDegreeCandidacyIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				degreeCandidacy = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (classFilter == null || (classFilter != null && classFilter.containsKey(type))) {
					log.info("instance: " + degreeCandidacy + "	type: " + type);
					return EVAL_BODY_AGAIN;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in UndergraduateAdvisingRelationshipDegreeCandidacyIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in UndergraduateAdvisingRelationshipDegreeCandidacyIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in UndergraduateAdvisingRelationshipDegreeCandidacy doEndTag", e);
			throw new JspTagException("Exception raised in UndergraduateAdvisingRelationshipDegreeCandidacy doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
		type = null;
		degreeCandidacy = null;
		classFilter = null;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setDegreeCandidacy(String degreeCandidacy) {
		this.degreeCandidacy = degreeCandidacy;
	}

	public String getDegreeCandidacy() {
		return degreeCandidacy;
	}

	public void setClassFilter(String filterString) {
		String[] classFilterArray = filterString.split(" ");
		this.classFilter = new Hashtable<String, String>();
		for (String filterClass : classFilterArray) {
			log.info("adding filterClass " + filterClass + " to UndergraduateAdvisingRelationshipDegreeCandidacyIterator");
			classFilter.put(filterClass, "");
		}
	}

	public String getClassFilter() {
		return classFilter.toString();
	}

}