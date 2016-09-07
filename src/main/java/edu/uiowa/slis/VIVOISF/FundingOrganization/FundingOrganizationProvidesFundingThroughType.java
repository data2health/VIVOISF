package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationProvidesFundingThroughType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationProvidesFundingThroughType currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationProvidesFundingThroughType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationProvidesFundingThroughIterator theFundingOrganizationProvidesFundingThroughIterator = (FundingOrganizationProvidesFundingThroughIterator)findAncestorWithClass(this, FundingOrganizationProvidesFundingThroughIterator.class);
			pageContext.getOut().print(theFundingOrganizationProvidesFundingThroughIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for providesFundingThrough tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for providesFundingThrough tag ");
		}
		return SKIP_BODY;
	}
}
