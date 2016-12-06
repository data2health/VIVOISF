package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleCountryAreaYearIterator theResearcherRole = (ResearcherRoleCountryAreaYearIterator)findAncestorWithClass(this, ResearcherRoleCountryAreaYearIterator.class);
			pageContext.getOut().print(theResearcherRole.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

