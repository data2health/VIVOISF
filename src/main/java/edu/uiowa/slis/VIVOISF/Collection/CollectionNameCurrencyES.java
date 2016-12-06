package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameCurrencyESIterator theCollection = (CollectionNameCurrencyESIterator)findAncestorWithClass(this, CollectionNameCurrencyESIterator.class);
			pageContext.getOut().print(theCollection.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

