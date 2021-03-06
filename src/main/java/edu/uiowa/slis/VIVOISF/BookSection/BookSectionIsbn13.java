package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionIsbn13Iterator theBookSection = (BookSectionIsbn13Iterator)findAncestorWithClass(this, BookSectionIsbn13Iterator.class);
			pageContext.getOut().print(theBookSection.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

