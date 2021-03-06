package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentRO_0001025Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentRO_0001025Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentRO_0001025Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentRO_0001025Iterator theAgentRO_0001025Iterator = (AgentRO_0001025Iterator)findAncestorWithClass(this, AgentRO_0001025Iterator.class);
			pageContext.getOut().print(theAgentRO_0001025Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

