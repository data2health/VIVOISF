package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationOrganizerInverseIterator theFoundationOrganizerInverseIterator = (FoundationOrganizerInverseIterator)findAncestorWithClass(this, FoundationOrganizerInverseIterator.class);
			pageContext.getOut().print(theFoundationOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for organizer tag ");
		}
		return SKIP_BODY;
	}
}
