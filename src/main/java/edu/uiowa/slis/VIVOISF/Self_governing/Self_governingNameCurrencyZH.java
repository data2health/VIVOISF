package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameCurrencyZHIterator theSelf_governing = (Self_governingNameCurrencyZHIterator)findAncestorWithClass(this, Self_governingNameCurrencyZHIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

