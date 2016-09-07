package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteHasTranslationIterator theQuoteHasTranslationIterator = (QuoteHasTranslationIterator)findAncestorWithClass(this, QuoteHasTranslationIterator.class);
			pageContext.getOut().print(theQuoteHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}
