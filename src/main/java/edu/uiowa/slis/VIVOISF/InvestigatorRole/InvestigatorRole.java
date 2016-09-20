package edu.uiowa.slis.VIVOISF.InvestigatorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class InvestigatorRole extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InvestigatorRole currentInstance = null;
	private static final Log log = LogFactory.getLog(InvestigatorRole.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;
	String hideFromDisplay = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			InvestigatorRoleIterator theInvestigatorRoleIterator = (InvestigatorRoleIterator) findAncestorWithClass(this, InvestigatorRoleIterator.class);

			if (theInvestigatorRoleIterator != null) {
				subjectURI = theInvestigatorRoleIterator.getSubjectURI();
				label = theInvestigatorRoleIterator.getLabel();
			}

			if (theInvestigatorRoleIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label  ?hideFromDisplay where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#hideFromDisplay> ?hideFromDisplay } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					hideFromDisplay = sol.get("?hideFromDisplay") == null ? null : sol.get("?hideFromDisplay").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in InvestigatorRole doStartTag", e);
			throw new JspTagException("Exception raised in InvestigatorRole doStartTag");
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
			log.error("Exception raised in InvestigatorRole doEndTag", e);
			throw new JspTagException("Exception raised in InvestigatorRole doEndTag");
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

	public void setHideFromDisplay(String hideFromDisplay) {
		this.hideFromDisplay = hideFromDisplay;
	}

	public String getHideFromDisplay() {
		return hideFromDisplay;
	}

}
