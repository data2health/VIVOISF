package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameCurrencyFRIterator thegeographical_region = (geographical_regionNameCurrencyFRIterator)findAncestorWithClass(this, geographical_regionNameCurrencyFRIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

