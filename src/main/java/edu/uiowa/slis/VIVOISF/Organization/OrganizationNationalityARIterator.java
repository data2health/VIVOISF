package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class OrganizationNationalityARIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNationalityARIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNationalityARIterator.class);

	String subjectURI = null;
	String nationalityAR = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Organization ancestorInstance = (Organization) findAncestorWithClass(this, Organization.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#nationalityAR> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				nationalityAR = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in OrganizationIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in OrganizationIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				nationalityAR = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in OrganizationIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in OrganizationIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Organization doEndTag", e);
			throw new JspTagException("Exception raised in Organization doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setNationalityAR(String nationalityAR) {
		this.nationalityAR = nationalityAR;
	}

	public String getNationalityAR() {
		return nationalityAR;
	}

}
