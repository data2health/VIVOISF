package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleReproducesIterator theEditorialArticleReproducesIterator = (EditorialArticleReproducesIterator)findAncestorWithClass(this, EditorialArticleReproducesIterator.class);
			pageContext.getOut().print(theEditorialArticleReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for reproduces tag ");
		}
		return SKIP_BODY;
	}
}
