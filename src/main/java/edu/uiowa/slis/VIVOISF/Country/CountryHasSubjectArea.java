package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryHasSubjectAreaIterator theCountryHasSubjectAreaIterator = (CountryHasSubjectAreaIterator)findAncestorWithClass(this, CountryHasSubjectAreaIterator.class);
			pageContext.getOut().print(theCountryHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

