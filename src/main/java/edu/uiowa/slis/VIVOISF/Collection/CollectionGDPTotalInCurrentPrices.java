package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionGDPTotalInCurrentPricesIterator theCollection = (CollectionGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, CollectionGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theCollection.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}
