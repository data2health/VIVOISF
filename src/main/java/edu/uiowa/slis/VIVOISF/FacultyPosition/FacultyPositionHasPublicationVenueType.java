package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionHasPublicationVenueIterator theFacultyPositionHasPublicationVenueIterator = (FacultyPositionHasPublicationVenueIterator)findAncestorWithClass(this, FacultyPositionHasPublicationVenueIterator.class);
			pageContext.getOut().print(theFacultyPositionHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

