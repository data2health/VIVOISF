package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationHasAddressIterator theLocationHasAddressIterator = (LocationHasAddressIterator)findAncestorWithClass(this, LocationHasAddressIterator.class);
			pageContext.getOut().print(theLocationHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}
