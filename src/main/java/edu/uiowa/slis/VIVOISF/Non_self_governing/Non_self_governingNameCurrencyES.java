package edu.uiowa.slis.VIVOISF.Non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Non_self_governingNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Non_self_governingNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(Non_self_governingNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Non_self_governingNameCurrencyESIterator theNon_self_governing = (Non_self_governingNameCurrencyESIterator)findAncestorWithClass(this, Non_self_governingNameCurrencyESIterator.class);
			pageContext.getOut().print(theNon_self_governing.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Non_self_governing for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Non_self_governing for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

