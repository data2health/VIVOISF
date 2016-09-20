package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class FilmARG_0000001Iterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmARG_0000001Iterator currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmARG_0000001Iterator.class);

	String subjectURI = null;
	String ARG_0000001 = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Film ancestorInstance = (Film) findAncestorWithClass(this, Film.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://purl.obolibrary.org/obo/ARG_0000001> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				ARG_0000001 = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in FilmIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in FilmIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				ARG_0000001 = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in FilmIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in FilmIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Film doEndTag", e);
			throw new JspTagException("Exception raised in Film doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setARG_0000001(String ARG_0000001) {
		this.ARG_0000001 = ARG_0000001;
	}

	public String getARG_0000001() {
		return ARG_0000001;
	}

}
