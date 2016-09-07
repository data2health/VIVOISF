package edu.uiowa.slis.VIVOISF.ARG_2000022;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ARG_2000022 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000022 currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000022.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ARG_2000022Iterator theARG_2000022Iterator = (ARG_2000022Iterator) findAncestorWithClass(this, ARG_2000022Iterator.class);

			if (theARG_2000022Iterator != null) {
				subjectURI = theARG_2000022Iterator.getSubjectURI();
				label = theARG_2000022Iterator.getLabel();
			}

			if (theARG_2000022Iterator == null && subjectURI == null) {
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
			log.error("Exception raised in ARG_2000022 doStartTag", e);
			throw new JspTagException("Exception raised in ARG_2000022 doStartTag");
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
			log.error("Exception raised in ARG_2000022 doEndTag", e);
			throw new JspTagException("Exception raised in ARG_2000022 doEndTag");
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