package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowHasPublicationVenueIterator theSlideshowHasPublicationVenueIterator = (SlideshowHasPublicationVenueIterator)findAncestorWithClass(this, SlideshowHasPublicationVenueIterator.class);
			pageContext.getOut().print(theSlideshowHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

