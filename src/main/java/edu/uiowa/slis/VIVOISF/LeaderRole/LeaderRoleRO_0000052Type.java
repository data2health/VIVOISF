package edu.uiowa.slis.VIVOISF.LeaderRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LeaderRoleRO_0000052Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LeaderRoleRO_0000052Type currentInstance = null;
	private static final Log log = LogFactory.getLog(LeaderRoleRO_0000052Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LeaderRoleRO_0000052Iterator theLeaderRoleRO_0000052Iterator = (LeaderRoleRO_0000052Iterator)findAncestorWithClass(this, LeaderRoleRO_0000052Iterator.class);
			pageContext.getOut().print(theLeaderRoleRO_0000052Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LeaderRole for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LeaderRole for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}
