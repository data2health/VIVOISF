package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterOrganizerInverseIterator theCenterOrganizerInverseIterator = (CenterOrganizerInverseIterator)findAncestorWithClass(this, CenterOrganizerInverseIterator.class);
			pageContext.getOut().print(theCenterOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for organizer tag ");
		}
		return SKIP_BODY;
	}
}
