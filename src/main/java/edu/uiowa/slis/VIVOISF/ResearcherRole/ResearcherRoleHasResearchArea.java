package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleHasResearchAreaIterator theResearcherRoleHasResearchAreaIterator = (ResearcherRoleHasResearchAreaIterator)findAncestorWithClass(this, ResearcherRoleHasResearchAreaIterator.class);
			pageContext.getOut().print(theResearcherRoleHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

