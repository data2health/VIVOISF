package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupHasPublicationVenueIterator thespecial_groupHasPublicationVenueIterator = (special_groupHasPublicationVenueIterator)findAncestorWithClass(this, special_groupHasPublicationVenueIterator.class);
			pageContext.getOut().print(thespecial_groupHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}
