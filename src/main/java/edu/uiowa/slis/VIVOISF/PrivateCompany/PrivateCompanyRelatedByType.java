package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyRelatedByIterator thePrivateCompanyRelatedByIterator = (PrivateCompanyRelatedByIterator)findAncestorWithClass(this, PrivateCompanyRelatedByIterator.class);
			pageContext.getOut().print(thePrivateCompanyRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}
