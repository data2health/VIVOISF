package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonDateTimeValueIterator thePersonDateTimeValueIterator = (PersonDateTimeValueIterator)findAncestorWithClass(this, PersonDateTimeValueIterator.class);
			pageContext.getOut().print(thePersonDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}
