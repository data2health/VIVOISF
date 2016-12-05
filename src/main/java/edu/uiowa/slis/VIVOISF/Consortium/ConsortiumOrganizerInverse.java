package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumOrganizerInverseIterator theConsortiumOrganizerInverseIterator = (ConsortiumOrganizerInverseIterator)findAncestorWithClass(this, ConsortiumOrganizerInverseIterator.class);
			pageContext.getOut().print(theConsortiumOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for organizer tag ");
		}
		return SKIP_BODY;
	}
}
