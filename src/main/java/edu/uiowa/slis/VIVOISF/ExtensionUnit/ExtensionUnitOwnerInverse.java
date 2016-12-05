package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitOwnerInverseIterator theExtensionUnitOwnerInverseIterator = (ExtensionUnitOwnerInverseIterator)findAncestorWithClass(this, ExtensionUnitOwnerInverseIterator.class);
			pageContext.getOut().print(theExtensionUnitOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for owner tag ");
		}
		return SKIP_BODY;
	}
}
