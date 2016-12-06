package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030NameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030NameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030NameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030NameCurrencyARIterator theIAO_0000030 = (IAO_0000030NameCurrencyARIterator)findAncestorWithClass(this, IAO_0000030NameCurrencyARIterator.class);
			pageContext.getOut().print(theIAO_0000030.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

