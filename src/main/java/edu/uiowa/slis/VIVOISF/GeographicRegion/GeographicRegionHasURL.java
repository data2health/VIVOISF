package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionHasURLIterator theGeographicRegionHasURLIterator = (GeographicRegionHasURLIterator)findAncestorWithClass(this, GeographicRegionHasURLIterator.class);
			pageContext.getOut().print(theGeographicRegionHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

