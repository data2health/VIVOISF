package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionGeographicFocusOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionGeographicFocusOf currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionGeographicFocusOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionGeographicFocusOfIterator thegeographical_regionGeographicFocusOfIterator = (geographical_regionGeographicFocusOfIterator)findAncestorWithClass(this, geographical_regionGeographicFocusOfIterator.class);
			pageContext.getOut().print(thegeographical_regionGeographicFocusOfIterator.getGeographicFocusOf());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for geographicFocusOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for geographicFocusOf tag ");
		}
		return SKIP_BODY;
	}
}
