package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(areaDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaDateTimeIntervalIterator theareaDateTimeIntervalIterator = (areaDateTimeIntervalIterator)findAncestorWithClass(this, areaDateTimeIntervalIterator.class);
			pageContext.getOut().print(theareaDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing area for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}
