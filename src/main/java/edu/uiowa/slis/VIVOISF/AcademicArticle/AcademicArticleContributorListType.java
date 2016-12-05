package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleContributorListIterator theAcademicArticleContributorListIterator = (AcademicArticleContributorListIterator)findAncestorWithClass(this, AcademicArticleContributorListIterator.class);
			pageContext.getOut().print(theAcademicArticleContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for contributorList tag ");
		}
		return SKIP_BODY;
	}
}
