package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationDistributesFundingFrom extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationDistributesFundingFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationDistributesFundingFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationDistributesFundingFromIterator theFundingOrganizationDistributesFundingFromIterator = (FundingOrganizationDistributesFundingFromIterator)findAncestorWithClass(this, FundingOrganizationDistributesFundingFromIterator.class);
			pageContext.getOut().print(theFundingOrganizationDistributesFundingFromIterator.getDistributesFundingFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for distributesFundingFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for distributesFundingFrom tag ");
		}
		return SKIP_BODY;
	}
}
