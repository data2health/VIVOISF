package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardAsinIterator theStandard = (StandardAsinIterator)findAncestorWithClass(this, StandardAsinIterator.class);
			pageContext.getOut().print(theStandard.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for asin tag ");
		}
		return SKIP_BODY;
	}
}
