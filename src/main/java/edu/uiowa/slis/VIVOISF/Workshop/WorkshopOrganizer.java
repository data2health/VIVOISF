package edu.uiowa.slis.VIVOISF.Workshop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkshopOrganizer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkshopOrganizer currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkshopOrganizer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkshopOrganizerIterator theWorkshopOrganizerIterator = (WorkshopOrganizerIterator)findAncestorWithClass(this, WorkshopOrganizerIterator.class);
			pageContext.getOut().print(theWorkshopOrganizerIterator.getOrganizer());
		} catch (Exception e) {
			log.error("Can't find enclosing Workshop for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Workshop for organizer tag ");
		}
		return SKIP_BODY;
	}
}
