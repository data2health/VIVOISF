package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyAssigneeForIterator theGovernmentAgencyAssigneeForIterator = (GovernmentAgencyAssigneeForIterator)findAncestorWithClass(this, GovernmentAgencyAssigneeForIterator.class);
			pageContext.getOut().print(theGovernmentAgencyAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}
