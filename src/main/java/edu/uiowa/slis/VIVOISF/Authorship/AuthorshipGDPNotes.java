package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipGDPNotesIterator theAuthorship = (AuthorshipGDPNotesIterator)findAncestorWithClass(this, AuthorshipGDPNotesIterator.class);
			pageContext.getOut().print(theAuthorship.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}
