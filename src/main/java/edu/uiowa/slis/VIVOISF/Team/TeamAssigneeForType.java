package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeamAssigneeForIterator theTeamAssigneeForIterator = (TeamAssigneeForIterator)findAncestorWithClass(this, TeamAssigneeForIterator.class);
			pageContext.getOut().print(theTeamAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}
