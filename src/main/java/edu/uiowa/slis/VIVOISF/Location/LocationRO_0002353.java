package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationRO_0002353 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationRO_0002353 currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationRO_0002353.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationRO_0002353Iterator theLocationRO_0002353Iterator = (LocationRO_0002353Iterator)findAncestorWithClass(this, LocationRO_0002353Iterator.class);
			pageContext.getOut().print(theLocationRO_0002353Iterator.getRO_0002353());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

