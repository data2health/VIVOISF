package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyPerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyPerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyPerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyPerformerInverseIterator thePrivateCompanyPerformerInverseIterator = (PrivateCompanyPerformerInverseIterator)findAncestorWithClass(this, PrivateCompanyPerformerInverseIterator.class);
			pageContext.getOut().print(thePrivateCompanyPerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for performer tag ");
		}
		return SKIP_BODY;
	}
}
