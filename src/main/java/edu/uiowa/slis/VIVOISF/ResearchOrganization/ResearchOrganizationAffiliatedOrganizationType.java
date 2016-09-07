package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationAffiliatedOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationAffiliatedOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationAffiliatedOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationAffiliatedOrganizationIterator theResearchOrganizationAffiliatedOrganizationIterator = (ResearchOrganizationAffiliatedOrganizationIterator)findAncestorWithClass(this, ResearchOrganizationAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theResearchOrganizationAffiliatedOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}
