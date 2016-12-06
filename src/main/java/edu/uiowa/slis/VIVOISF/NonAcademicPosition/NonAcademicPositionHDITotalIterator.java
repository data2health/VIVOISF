package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class NonAcademicPositionHDITotalIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionHDITotalIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionHDITotalIterator.class);

	String subjectURI = null;
	String HDITotal = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			NonAcademicPosition ancestorInstance = (NonAcademicPosition) findAncestorWithClass(this, NonAcademicPosition.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#HDITotal> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				HDITotal = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in NonAcademicPositionIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in NonAcademicPositionIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				HDITotal = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in NonAcademicPositionIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in NonAcademicPositionIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in NonAcademicPosition doEndTag", e);
			throw new JspTagException("Exception raised in NonAcademicPosition doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setHDITotal(String HDITotal) {
		this.HDITotal = HDITotal;
	}

	public String getHDITotal() {
		return HDITotal;
	}

}
