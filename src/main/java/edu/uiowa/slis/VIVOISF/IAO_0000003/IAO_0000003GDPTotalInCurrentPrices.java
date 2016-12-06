package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003GDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003GDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003GDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003GDPTotalInCurrentPricesIterator theIAO_0000003 = (IAO_0000003GDPTotalInCurrentPricesIterator)findAncestorWithClass(this, IAO_0000003GDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theIAO_0000003.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

