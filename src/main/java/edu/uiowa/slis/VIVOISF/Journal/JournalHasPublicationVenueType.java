package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasPublicationVenueIterator theJournalHasPublicationVenueIterator = (JournalHasPublicationVenueIterator)findAncestorWithClass(this, JournalHasPublicationVenueIterator.class);
			pageContext.getOut().print(theJournalHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

