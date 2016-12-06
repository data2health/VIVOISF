package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalRelatesIterator theDateTimeIntervalRelatesIterator = (DateTimeIntervalRelatesIterator)findAncestorWithClass(this, DateTimeIntervalRelatesIterator.class);
			pageContext.getOut().print(theDateTimeIntervalRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for relates tag ");
		}
		return SKIP_BODY;
	}
}
