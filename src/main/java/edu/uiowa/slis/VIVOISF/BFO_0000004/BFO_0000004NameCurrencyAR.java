package edu.uiowa.slis.VIVOISF.BFO_0000004;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000004NameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000004NameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000004NameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000004NameCurrencyARIterator theBFO_0000004 = (BFO_0000004NameCurrencyARIterator)findAncestorWithClass(this, BFO_0000004NameCurrencyARIterator.class);
			pageContext.getOut().print(theBFO_0000004.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000004 for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000004 for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

