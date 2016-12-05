package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailContributorListIterator theEmailContributorListIterator = (EmailContributorListIterator)findAncestorWithClass(this, EmailContributorListIterator.class);
			pageContext.getOut().print(theEmailContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for contributorList tag ");
		}
		return SKIP_BODY;
	}
}
