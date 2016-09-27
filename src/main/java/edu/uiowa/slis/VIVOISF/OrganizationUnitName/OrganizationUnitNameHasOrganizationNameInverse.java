package edu.uiowa.slis.VIVOISF.OrganizationUnitName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationUnitNameHasOrganizationNameInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationUnitNameHasOrganizationNameInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationUnitNameHasOrganizationNameInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationUnitNameHasOrganizationNameInverseIterator theOrganizationUnitNameHasOrganizationNameInverseIterator = (OrganizationUnitNameHasOrganizationNameInverseIterator)findAncestorWithClass(this, OrganizationUnitNameHasOrganizationNameInverseIterator.class);
			pageContext.getOut().print(theOrganizationUnitNameHasOrganizationNameInverseIterator.getHasOrganizationNameInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizationUnitName for hasOrganizationName tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizationUnitName for hasOrganizationName tag ");
		}
		return SKIP_BODY;
	}
}
