package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationBFO_0000051Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationBFO_0000051Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationBFO_0000051Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationBFO_0000051Iterator theGeographicLocationBFO_0000051Iterator = (GeographicLocationBFO_0000051Iterator)findAncestorWithClass(this, GeographicLocationBFO_0000051Iterator.class);
			pageContext.getOut().print(theGeographicLocationBFO_0000051Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

