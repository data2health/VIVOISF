package edu.uiowa.slis.VIVOISF.Non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Non_self_governingPopulationTotalIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Non_self_governingPopulationTotalIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(Non_self_governingPopulationTotalIterator.class);

	String subjectURI = null;
	String populationTotal = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Non_self_governing ancestorInstance = (Non_self_governing) findAncestorWithClass(this, Non_self_governing.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#populationTotal> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				populationTotal = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in Non_self_governingIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in Non_self_governingIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				populationTotal = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in Non_self_governingIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in Non_self_governingIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Non_self_governing doEndTag", e);
			throw new JspTagException("Exception raised in Non_self_governing doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setPopulationTotal(String populationTotal) {
		this.populationTotal = populationTotal;
	}

	public String getPopulationTotal() {
		return populationTotal;
	}

}