package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationRO_0001015Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationRO_0001015Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationRO_0001015Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationRO_0001015Iterator theGeographicLocationRO_0001015Iterator = (GeographicLocationRO_0001015Iterator)findAncestorWithClass(this, GeographicLocationRO_0001015Iterator.class);
			pageContext.getOut().print(theGeographicLocationRO_0001015Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

