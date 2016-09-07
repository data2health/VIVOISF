package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherHasPredecessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherHasPredecessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherHasPredecessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherHasPredecessorOrganizationIterator thePublisherHasPredecessorOrganizationIterator = (PublisherHasPredecessorOrganizationIterator)findAncestorWithClass(this, PublisherHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(thePublisherHasPredecessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}
