package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitAffiliatedOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitAffiliatedOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitAffiliatedOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitAffiliatedOrganizationIterator theExtensionUnitAffiliatedOrganizationIterator = (ExtensionUnitAffiliatedOrganizationIterator)findAncestorWithClass(this, ExtensionUnitAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theExtensionUnitAffiliatedOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}
