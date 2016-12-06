package edu.uiowa.slis.VIVOISF.BFO_0000017;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000017HasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000017HasName currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000017HasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000017HasNameIterator theBFO_0000017HasNameIterator = (BFO_0000017HasNameIterator)findAncestorWithClass(this, BFO_0000017HasNameIterator.class);
			pageContext.getOut().print(theBFO_0000017HasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000017 for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000017 for hasName tag ");
		}
		return SKIP_BODY;
	}
}
