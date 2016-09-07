package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationSubcontractsGrant extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationSubcontractsGrant currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationSubcontractsGrant.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationSubcontractsGrantIterator theClinicalOrganizationSubcontractsGrantIterator = (ClinicalOrganizationSubcontractsGrantIterator)findAncestorWithClass(this, ClinicalOrganizationSubcontractsGrantIterator.class);
			pageContext.getOut().print(theClinicalOrganizationSubcontractsGrantIterator.getSubcontractsGrant());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}
