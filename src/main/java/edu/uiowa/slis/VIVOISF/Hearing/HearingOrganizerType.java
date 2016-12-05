package edu.uiowa.slis.VIVOISF.Hearing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HearingOrganizerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HearingOrganizerType currentInstance = null;
	private static final Log log = LogFactory.getLog(HearingOrganizerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HearingOrganizerIterator theHearingOrganizerIterator = (HearingOrganizerIterator)findAncestorWithClass(this, HearingOrganizerIterator.class);
			pageContext.getOut().print(theHearingOrganizerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Hearing for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hearing for organizer tag ");
		}
		return SKIP_BODY;
	}
}
