package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyPublicationVenueForIterator theGovernmentAgencyPublicationVenueForIterator = (GovernmentAgencyPublicationVenueForIterator)findAncestorWithClass(this, GovernmentAgencyPublicationVenueForIterator.class);
			pageContext.getOut().print(theGovernmentAgencyPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}
