package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameCurrencyITIterator theGeopoliticalEntity = (GeopoliticalEntityNameCurrencyITIterator)findAncestorWithClass(this, GeopoliticalEntityNameCurrencyITIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

