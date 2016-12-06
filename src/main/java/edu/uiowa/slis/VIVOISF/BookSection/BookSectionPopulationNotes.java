package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionPopulationNotesIterator theBookSection = (BookSectionPopulationNotesIterator)findAncestorWithClass(this, BookSectionPopulationNotesIterator.class);
			pageContext.getOut().print(theBookSection.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}
