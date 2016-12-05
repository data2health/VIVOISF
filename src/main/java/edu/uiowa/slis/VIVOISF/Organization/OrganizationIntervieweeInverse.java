package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationIntervieweeInverseIterator theOrganizationIntervieweeInverseIterator = (OrganizationIntervieweeInverseIterator)findAncestorWithClass(this, OrganizationIntervieweeInverseIterator.class);
			pageContext.getOut().print(theOrganizationIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for interviewee tag ");
		}
		return SKIP_BODY;
	}
}
