package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionPublisherIterator theGeographicRegionPublisherIterator = (GeographicRegionPublisherIterator)findAncestorWithClass(this, GeographicRegionPublisherIterator.class);
			pageContext.getOut().print(theGeographicRegionPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for publisher tag ");
		}
		return SKIP_BODY;
	}
}
