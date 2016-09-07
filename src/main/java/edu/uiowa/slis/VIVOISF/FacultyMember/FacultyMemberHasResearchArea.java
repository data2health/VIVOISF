package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberHasResearchAreaIterator theFacultyMemberHasResearchAreaIterator = (FacultyMemberHasResearchAreaIterator)findAncestorWithClass(this, FacultyMemberHasResearchAreaIterator.class);
			pageContext.getOut().print(theFacultyMemberHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}
