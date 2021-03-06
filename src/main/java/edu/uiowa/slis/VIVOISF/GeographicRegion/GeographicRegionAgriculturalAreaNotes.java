package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionAgriculturalAreaNotesIterator theGeographicRegion = (GeographicRegionAgriculturalAreaNotesIterator)findAncestorWithClass(this, GeographicRegionAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theGeographicRegion.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

