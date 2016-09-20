package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationOBI_0000304Inverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationOBI_0000304Inverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationOBI_0000304Inverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationOBI_0000304InverseIterator theFoundationOBI_0000304InverseIterator = (FoundationOBI_0000304InverseIterator)findAncestorWithClass(this, FoundationOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theFoundationOBI_0000304InverseIterator.getOBI_0000304Inverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

