package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameListZHIterator theOrganization = (OrganizationNameListZHIterator)findAncestorWithClass(this, OrganizationNameListZHIterator.class);
			pageContext.getOut().print(theOrganization.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

