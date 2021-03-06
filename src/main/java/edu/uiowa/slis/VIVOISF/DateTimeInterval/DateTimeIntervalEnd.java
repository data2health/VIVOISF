package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalEnd.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalEndIterator theDateTimeIntervalEndIterator = (DateTimeIntervalEndIterator)findAncestorWithClass(this, DateTimeIntervalEndIterator.class);
			pageContext.getOut().print(theDateTimeIntervalEndIterator.getEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for end tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for end tag ");
		}
		return SKIP_BODY;
	}
}

