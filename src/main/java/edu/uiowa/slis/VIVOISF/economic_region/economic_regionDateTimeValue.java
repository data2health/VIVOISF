package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionDateTimeValueIterator theeconomic_regionDateTimeValueIterator = (economic_regionDateTimeValueIterator)findAncestorWithClass(this, economic_regionDateTimeValueIterator.class);
			pageContext.getOut().print(theeconomic_regionDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}
