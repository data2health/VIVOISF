package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueLandAreaUnitIterator theDateTimeValue = (DateTimeValueLandAreaUnitIterator)findAncestorWithClass(this, DateTimeValueLandAreaUnitIterator.class);
			pageContext.getOut().print(theDateTimeValue.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}
