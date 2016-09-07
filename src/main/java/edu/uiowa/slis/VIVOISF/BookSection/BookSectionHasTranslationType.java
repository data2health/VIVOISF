package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionHasTranslationIterator theBookSectionHasTranslationIterator = (BookSectionHasTranslationIterator)findAncestorWithClass(this, BookSectionHasTranslationIterator.class);
			pageContext.getOut().print(theBookSectionHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}
