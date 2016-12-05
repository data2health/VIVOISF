package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationIntervieweeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationIntervieweeType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationIntervieweeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationIntervieweeIterator theOrganizationIntervieweeIterator = (OrganizationIntervieweeIterator)findAncestorWithClass(this, OrganizationIntervieweeIterator.class);
			pageContext.getOut().print(theOrganizationIntervieweeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for interviewee tag ");
		}
		return SKIP_BODY;
	}
}
