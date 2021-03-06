package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryCodeGAULIterator theCountry = (CountryCodeGAULIterator)findAncestorWithClass(this, CountryCodeGAULIterator.class);
			pageContext.getOut().print(theCountry.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

