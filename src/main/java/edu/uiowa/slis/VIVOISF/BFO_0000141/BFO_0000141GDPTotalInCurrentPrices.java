package edu.uiowa.slis.VIVOISF.BFO_0000141;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000141GDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000141GDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000141GDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000141GDPTotalInCurrentPricesIterator theBFO_0000141 = (BFO_0000141GDPTotalInCurrentPricesIterator)findAncestorWithClass(this, BFO_0000141GDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theBFO_0000141.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000141 for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000141 for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

