package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameShortITIterator theGeographicLocation = (GeographicLocationNameShortITIterator)findAncestorWithClass(this, GeographicLocationNameShortITIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

