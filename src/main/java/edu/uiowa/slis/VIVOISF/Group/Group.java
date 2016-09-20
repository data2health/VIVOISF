package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class group extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static group currentInstance = null;
	private static final Log log = LogFactory.getLog(group.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			groupIterator thegroupIterator = (groupIterator) findAncestorWithClass(this, groupIterator.class);

			if (thegroupIterator != null) {
				subjectURI = thegroupIterator.getSubjectURI();
				label = thegroupIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.territory.territoryIsInGroupIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.territory.territoryIsInGroupIterator)this.getParent()).getIsInGroup();
			}

			edu.uiowa.slis.VIVOISF.territory.territoryIsInGroupIterator theterritoryIsInGroupIterator = (edu.uiowa.slis.VIVOISF.territory.territoryIsInGroupIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.territory.territoryIsInGroupIterator.class);

			if (subjectURI == null && theterritoryIsInGroupIterator != null) {
				subjectURI = theterritoryIsInGroupIterator.getIsInGroup();
			}

			if (thegroupIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in group doStartTag", e);
			throw new JspTagException("Exception raised in group doStartTag");
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
			log.error("Exception raised in group doEndTag", e);
			throw new JspTagException("Exception raised in group doEndTag");
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

}
