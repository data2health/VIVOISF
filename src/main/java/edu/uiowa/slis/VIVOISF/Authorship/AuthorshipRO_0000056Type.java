package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorshipRO_0000056Iterator theAuthorshipRO_0000056Iterator = (AuthorshipRO_0000056Iterator)findAncestorWithClass(this, AuthorshipRO_0000056Iterator.class);
			pageContext.getOut().print(theAuthorshipRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}
