package edu.uiowa.slis.VIVOISF.BFO_0000008;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000008HasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000008HasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000008HasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000008HasPublicationVenueIterator theBFO_0000008HasPublicationVenueIterator = (BFO_0000008HasPublicationVenueIterator)findAncestorWithClass(this, BFO_0000008HasPublicationVenueIterator.class);
			pageContext.getOut().print(theBFO_0000008HasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000008 for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000008 for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}
