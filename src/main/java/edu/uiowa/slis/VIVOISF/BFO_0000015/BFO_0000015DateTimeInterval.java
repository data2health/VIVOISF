package edu.uiowa.slis.VIVOISF.BFO_0000015;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000015DateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000015DateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000015DateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000015DateTimeIntervalIterator theBFO_0000015DateTimeIntervalIterator = (BFO_0000015DateTimeIntervalIterator)findAncestorWithClass(this, BFO_0000015DateTimeIntervalIterator.class);
			pageContext.getOut().print(theBFO_0000015DateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000015 for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000015 for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

