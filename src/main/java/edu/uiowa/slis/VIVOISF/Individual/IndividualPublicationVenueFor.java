package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualPublicationVenueForIterator theIndividualPublicationVenueForIterator = (IndividualPublicationVenueForIterator)findAncestorWithClass(this, IndividualPublicationVenueForIterator.class);
			pageContext.getOut().print(theIndividualPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

