package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationDateTimeValueIterator theOrganizationDateTimeValueIterator = (OrganizationDateTimeValueIterator)findAncestorWithClass(this, OrganizationDateTimeValueIterator.class);
			pageContext.getOut().print(theOrganizationDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}
