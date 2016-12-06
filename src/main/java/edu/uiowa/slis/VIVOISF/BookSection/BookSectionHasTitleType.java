package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionHasTitleIterator theBookSectionHasTitleIterator = (BookSectionHasTitleIterator)findAncestorWithClass(this, BookSectionHasTitleIterator.class);
			pageContext.getOut().print(theBookSectionHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}
