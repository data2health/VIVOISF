package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009CountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009CountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009CountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009CountryAreaTotalIterator theIAO_0000009 = (IAO_0000009CountryAreaTotalIterator)findAncestorWithClass(this, IAO_0000009CountryAreaTotalIterator.class);
			pageContext.getOut().print(theIAO_0000009.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}
