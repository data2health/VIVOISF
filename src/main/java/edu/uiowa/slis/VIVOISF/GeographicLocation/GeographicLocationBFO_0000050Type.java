package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationBFO_0000050Iterator theGeographicLocationBFO_0000050Iterator = (GeographicLocationBFO_0000050Iterator)findAncestorWithClass(this, GeographicLocationBFO_0000050Iterator.class);
			pageContext.getOut().print(theGeographicLocationBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

