package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleHasTitleIterator theResearcherRoleHasTitleIterator = (ResearcherRoleHasTitleIterator)findAncestorWithClass(this, ResearcherRoleHasTitleIterator.class);
			pageContext.getOut().print(theResearcherRoleHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

