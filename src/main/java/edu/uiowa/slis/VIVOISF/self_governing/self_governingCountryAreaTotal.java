package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingCountryAreaTotalIterator theself_governing = (self_governingCountryAreaTotalIterator)findAncestorWithClass(this, self_governingCountryAreaTotalIterator.class);
			pageContext.getOut().print(theself_governing.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}
