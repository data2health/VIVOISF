package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameCurrencyZHIterator theCollection = (CollectionNameCurrencyZHIterator)findAncestorWithClass(this, CollectionNameCurrencyZHIterator.class);
			pageContext.getOut().print(theCollection.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

