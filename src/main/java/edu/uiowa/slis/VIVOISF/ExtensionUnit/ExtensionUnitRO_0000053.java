package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitRO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitRO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitRO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitRO_0000053Iterator theExtensionUnitRO_0000053Iterator = (ExtensionUnitRO_0000053Iterator)findAncestorWithClass(this, ExtensionUnitRO_0000053Iterator.class);
			pageContext.getOut().print(theExtensionUnitRO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}
