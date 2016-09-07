package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardStatusIterator theStandardStatusIterator = (StandardStatusIterator)findAncestorWithClass(this, StandardStatusIterator.class);
			pageContext.getOut().print(theStandardStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for status tag ");
		}
		return SKIP_BODY;
	}
}
