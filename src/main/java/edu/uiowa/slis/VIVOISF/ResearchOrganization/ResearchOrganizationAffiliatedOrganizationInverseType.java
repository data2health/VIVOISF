package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationAffiliatedOrganizationInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationAffiliatedOrganizationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationAffiliatedOrganizationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationAffiliatedOrganizationInverseIterator theResearchOrganizationAffiliatedOrganizationInverseIterator = (ResearchOrganizationAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, ResearchOrganizationAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theResearchOrganizationAffiliatedOrganizationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

