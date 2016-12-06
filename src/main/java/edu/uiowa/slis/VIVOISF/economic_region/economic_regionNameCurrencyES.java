package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameCurrencyESIterator theeconomic_region = (economic_regionNameCurrencyESIterator)findAncestorWithClass(this, economic_regionNameCurrencyESIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}
