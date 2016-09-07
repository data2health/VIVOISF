package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Report extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Report currentInstance = null;
	private static final Log log = LogFactory.getLog(Report.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String reportId = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ReportIterator theReportIterator = (ReportIterator) findAncestorWithClass(this, ReportIterator.class);

			if (theReportIterator != null) {
				subjectURI = theReportIterator.getSubjectURI();
				label = theReportIterator.getLabel();
			}

			if (theReportIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(Prefix_1_4
				+ " SELECT ?label  ?reportId where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#reportId> ?reportId } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					reportId = sol.get("?reportId") == null ? null : sol.get("?reportId").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Report doStartTag", e);
			throw new JspTagException("Exception raised in Report doStartTag");
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
			log.error("Exception raised in Report doEndTag", e);
			throw new JspTagException("Exception raised in Report doEndTag");
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

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getReportId() {
		return reportId;
	}

}