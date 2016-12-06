package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ChapterCodeDBPediaIDIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterCodeDBPediaIDIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterCodeDBPediaIDIterator.class);

	String subjectURI = null;
	String codeDBPediaID = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Chapter ancestorInstance = (Chapter) findAncestorWithClass(this, Chapter.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#codeDBPediaID> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				codeDBPediaID = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in ChapterIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ChapterIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				codeDBPediaID = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in ChapterIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in ChapterIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Chapter doEndTag", e);
			throw new JspTagException("Exception raised in Chapter doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setCodeDBPediaID(String codeDBPediaID) {
		this.codeDBPediaID = codeDBPediaID;
	}

	public String getCodeDBPediaID() {
		return codeDBPediaID;
	}

}
