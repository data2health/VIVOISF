package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationSubcontractsGrant extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationSubcontractsGrant currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationSubcontractsGrant.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationSubcontractsGrantIterator theOrganizationSubcontractsGrantIterator = (OrganizationSubcontractsGrantIterator)findAncestorWithClass(this, OrganizationSubcontractsGrantIterator.class);
			pageContext.getOut().print(theOrganizationSubcontractsGrantIterator.getSubcontractsGrant());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}
