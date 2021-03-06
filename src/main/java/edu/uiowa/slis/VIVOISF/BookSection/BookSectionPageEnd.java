package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionPageEndIterator theBookSection = (BookSectionPageEndIterator)findAncestorWithClass(this, BookSectionPageEndIterator.class);
			pageContext.getOut().print(theBookSection.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

