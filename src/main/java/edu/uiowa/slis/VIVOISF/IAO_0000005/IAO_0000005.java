package edu.uiowa.slis.VIVOISF.IAO_0000005;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class IAO_0000005 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000005 currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000005.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			IAO_0000005Iterator theIAO_0000005Iterator = (IAO_0000005Iterator) findAncestorWithClass(this, IAO_0000005Iterator.class);

			if (theIAO_0000005Iterator != null) {
				subjectURI = theIAO_0000005Iterator.getSubjectURI();
				label = theIAO_0000005Iterator.getLabel();
			}

			if (theIAO_0000005Iterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(Prefix_1_4
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in IAO_0000005 doStartTag", e);
			throw new JspTagException("Exception raised in IAO_0000005 doStartTag");
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
			log.error("Exception raised in IAO_0000005 doEndTag", e);
			throw new JspTagException("Exception raised in IAO_0000005 doEndTag");
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