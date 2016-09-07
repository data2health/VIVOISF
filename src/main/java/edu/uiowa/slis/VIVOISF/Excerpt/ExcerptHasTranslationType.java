package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptHasTranslationIterator theExcerptHasTranslationIterator = (ExcerptHasTranslationIterator)findAncestorWithClass(this, ExcerptHasTranslationIterator.class);
			pageContext.getOut().print(theExcerptHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}
