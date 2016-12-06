package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNameOfficialFRIterator theArticle = (ArticleNameOfficialFRIterator)findAncestorWithClass(this, ArticleNameOfficialFRIterator.class);
			pageContext.getOut().print(theArticle.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}
