package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueCodeUNDPIterator theDateTimeValue = (DateTimeValueCodeUNDPIterator)findAncestorWithClass(this, DateTimeValueCodeUNDPIterator.class);
			pageContext.getOut().print(theDateTimeValue.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}
