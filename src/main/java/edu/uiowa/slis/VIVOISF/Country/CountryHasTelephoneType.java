package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryHasTelephoneIterator theCountryHasTelephoneIterator = (CountryHasTelephoneIterator)findAncestorWithClass(this, CountryHasTelephoneIterator.class);
			pageContext.getOut().print(theCountryHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}
