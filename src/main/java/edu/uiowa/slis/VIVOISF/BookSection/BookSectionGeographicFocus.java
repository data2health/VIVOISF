package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionGeographicFocusIterator theBookSectionGeographicFocusIterator = (BookSectionGeographicFocusIterator)findAncestorWithClass(this, BookSectionGeographicFocusIterator.class);
			pageContext.getOut().print(theBookSectionGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}
