package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationHasSubjectAreaIterator theOrganizationHasSubjectAreaIterator = (OrganizationHasSubjectAreaIterator)findAncestorWithClass(this, OrganizationHasSubjectAreaIterator.class);
			pageContext.getOut().print(theOrganizationHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

