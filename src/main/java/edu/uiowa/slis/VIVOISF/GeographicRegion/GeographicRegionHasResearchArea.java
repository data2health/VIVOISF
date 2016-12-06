package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionHasResearchAreaIterator theGeographicRegionHasResearchAreaIterator = (GeographicRegionHasResearchAreaIterator)findAncestorWithClass(this, GeographicRegionHasResearchAreaIterator.class);
			pageContext.getOut().print(theGeographicRegionHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

