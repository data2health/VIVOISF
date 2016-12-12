package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

import java.util.Hashtable;

@SuppressWarnings("serial")
public class Self_governingIsAdministeredByInverseIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingIsAdministeredByInverseIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingIsAdministeredByInverseIterator.class);

	String subjectURI = null;
	String type = null;
	String isAdministeredByInverse = null;
	ResultSet rs = null;
	Hashtable<String,String> classFilter = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Self_governing theSelf_governing = (Self_governing) findAncestorWithClass(this, Self_governing.class);

			if (theSelf_governing != null) {
				subjectURI = theSelf_governing.getSubjectURI();
			}

			if (theSelf_governing == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s ?t where {"
					+" ?s <http://aims.fao.org/aos/geopolitical.owl#isAdministeredBy> <" + subjectURI+ "> . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				isAdministeredByInverse = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (type == null)
					continue;
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + isAdministeredByInverse + "	type: " + type);
					return EVAL_BODY_INCLUDE;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Self_governingIsAdministeredByInverseIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in Self_governingIsAdministeredByInverseIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				isAdministeredByInverse = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (type == null)
					continue;
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + isAdministeredByInverse + "	type: " + type);
					return EVAL_BODY_AGAIN;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Self_governingIsAdministeredByIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in Self_governingIsAdministeredByIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Self_governingIsAdministeredBy doEndTag", e);
			throw new JspTagException("Exception raised in Self_governingIsAdministeredBy doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
		type = null;
		isAdministeredByInverse = null;
		classFilter = null;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setIsAdministeredByInverse(String isAdministeredByInverse) {
		this.isAdministeredByInverse = isAdministeredByInverse;
	}

	public String getIsAdministeredByInverse() {
		return isAdministeredByInverse;
	}

	public void setClassFilter(String filterString) {
		String[] classFilterArray = filterString.split(" ");
		this.classFilter = new Hashtable<String, String>();
		for (String filterClass : classFilterArray) {
			log.info("adding filterClass " + filterClass + " to Self_governingIsAdministeredByIterator");
			classFilter.put(filterClass, "");
		}
	}

	public String getClassFilter() {
		return classFilter.toString();
	}

}