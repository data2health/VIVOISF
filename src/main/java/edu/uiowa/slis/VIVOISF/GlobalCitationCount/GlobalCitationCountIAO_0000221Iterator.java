package edu.uiowa.slis.VIVOISF.GlobalCitationCount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

import java.util.Hashtable;

@SuppressWarnings("serial")
public class GlobalCitationCountIAO_0000221Iterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GlobalCitationCountIAO_0000221Iterator currentInstance = null;
	private static final Log log = LogFactory.getLog(GlobalCitationCountIAO_0000221Iterator.class);

	String subjectURI = null;
	String type = null;
	String IAO_0000221 = null;
	ResultSet rs = null;
	Hashtable<String,String> classFilter = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			GlobalCitationCount theGlobalCitationCount = (GlobalCitationCount) findAncestorWithClass(this, GlobalCitationCount.class);

			if (theGlobalCitationCount != null) {
				subjectURI = theGlobalCitationCount.getSubjectURI();
			}

			if (theGlobalCitationCount == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s ?t where {"
					+" <" + subjectURI + "> <http://purl.obolibrary.org/obo/IAO_0000221> ?s . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				IAO_0000221 = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (classFilter == null || (classFilter != null && classFilter.containsKey(type))) {
					log.info("instance: " + IAO_0000221 + "	type: " + type);
					return EVAL_BODY_INCLUDE;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in GlobalCitationCountIAO_0000221Iterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in GlobalCitationCountIAO_0000221Iterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				IAO_0000221 = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (classFilter == null || (classFilter != null && classFilter.containsKey(type))) {
					log.info("instance: " + IAO_0000221 + "	type: " + type);
					return EVAL_BODY_AGAIN;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in GlobalCitationCountIAO_0000221Iterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in GlobalCitationCountIAO_0000221Iterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in GlobalCitationCountIAO_0000221 doEndTag", e);
			throw new JspTagException("Exception raised in GlobalCitationCountIAO_0000221 doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
		type = null;
		IAO_0000221 = null;
		classFilter = null;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setIAO_0000221(String IAO_0000221) {
		this.IAO_0000221 = IAO_0000221;
	}

	public String getIAO_0000221() {
		return IAO_0000221;
	}

	public void setClassFilter(String filterString) {
		String[] classFilterArray = filterString.split(" ");
		this.classFilter = new Hashtable<String, String>();
		for (String filterClass : classFilterArray) {
			log.info("adding filterClass " + filterClass + " to GlobalCitationCountIAO_0000221Iterator");
			classFilter.put(filterClass, "");
		}
	}

	public String getClassFilter() {
		return classFilter.toString();
	}

}