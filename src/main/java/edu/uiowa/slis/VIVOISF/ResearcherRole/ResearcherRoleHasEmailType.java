package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleHasEmailIterator theResearcherRoleHasEmailIterator = (ResearcherRoleHasEmailIterator)findAncestorWithClass(this, ResearcherRoleHasEmailIterator.class);
			pageContext.getOut().print(theResearcherRoleHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

