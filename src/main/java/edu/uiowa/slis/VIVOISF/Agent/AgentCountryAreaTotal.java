package edu.uiowa.slis.VIVOISF.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AgentCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentCountryAreaTotalIterator theAgent = (AgentCountryAreaTotalIterator)findAncestorWithClass(this, AgentCountryAreaTotalIterator.class);
			pageContext.getOut().print(theAgent.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}
