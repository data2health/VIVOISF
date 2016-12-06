package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationHasAddressIterator theGeographicLocationHasAddressIterator = (GeographicLocationHasAddressIterator)findAncestorWithClass(this, GeographicLocationHasAddressIterator.class);
			pageContext.getOut().print(theGeographicLocationHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

