package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonPublicationVenueForIterator thePersonPublicationVenueForIterator = (PersonPublicationVenueForIterator)findAncestorWithClass(this, PersonPublicationVenueForIterator.class);
			pageContext.getOut().print(thePersonPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}
