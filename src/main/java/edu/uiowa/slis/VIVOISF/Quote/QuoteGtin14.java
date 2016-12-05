package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			QuoteGtin14Iterator theQuote = (QuoteGtin14Iterator)findAncestorWithClass(this, QuoteGtin14Iterator.class);
			pageContext.getOut().print(theQuote.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}
