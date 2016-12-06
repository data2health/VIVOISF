package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameCurrencyESIterator theResearcherRole = (ResearcherRoleNameCurrencyESIterator)findAncestorWithClass(this, ResearcherRoleNameCurrencyESIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

