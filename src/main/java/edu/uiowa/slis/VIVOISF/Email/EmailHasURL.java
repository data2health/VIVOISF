package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailHasURLIterator theEmailHasURLIterator = (EmailHasURLIterator)findAncestorWithClass(this, EmailHasURLIterator.class);
			pageContext.getOut().print(theEmailHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for hasURL tag ");
		}
		return SKIP_BODY;
	}
}
