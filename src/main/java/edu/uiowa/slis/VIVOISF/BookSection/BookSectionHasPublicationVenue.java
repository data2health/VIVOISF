package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionHasPublicationVenueIterator theBookSectionHasPublicationVenueIterator = (BookSectionHasPublicationVenueIterator)findAncestorWithClass(this, BookSectionHasPublicationVenueIterator.class);
			pageContext.getOut().print(theBookSectionHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

