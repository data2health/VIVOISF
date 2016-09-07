package edu.uiowa.slis.VIVOISF.BFO_0000016;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class BFO_0000016 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000016 currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000016.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			BFO_0000016Iterator theBFO_0000016Iterator = (BFO_0000016Iterator) findAncestorWithClass(this, BFO_0000016Iterator.class);

			if (theBFO_0000016Iterator != null) {
				subjectURI = theBFO_0000016Iterator.getSubjectURI();
				label = theBFO_0000016Iterator.getLabel();
			}

			if (theBFO_0000016Iterator == null && subjectURI == null) {
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
			log.error("Exception raised in BFO_0000016 doStartTag", e);
			throw new JspTagException("Exception raised in BFO_0000016 doStartTag");
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
			log.error("Exception raised in BFO_0000016 doEndTag", e);
			throw new JspTagException("Exception raised in BFO_0000016 doEndTag");
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