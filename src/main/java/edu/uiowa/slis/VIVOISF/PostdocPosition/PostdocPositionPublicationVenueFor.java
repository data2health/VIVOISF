package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionPublicationVenueForIterator thePostdocPositionPublicationVenueForIterator = (PostdocPositionPublicationVenueForIterator)findAncestorWithClass(this, PostdocPositionPublicationVenueForIterator.class);
			pageContext.getOut().print(thePostdocPositionPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}
