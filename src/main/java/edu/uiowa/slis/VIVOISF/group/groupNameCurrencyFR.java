package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(groupNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupNameCurrencyFRIterator thegroup = (groupNameCurrencyFRIterator)findAncestorWithClass(this, groupNameCurrencyFRIterator.class);
			pageContext.getOut().print(thegroup.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing group for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}
