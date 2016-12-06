package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionDateTimeIntervalIterator thegeographical_regionDateTimeIntervalIterator = (geographical_regionDateTimeIntervalIterator)findAncestorWithClass(this, geographical_regionDateTimeIntervalIterator.class);
			pageContext.getOut().print(thegeographical_regionDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

