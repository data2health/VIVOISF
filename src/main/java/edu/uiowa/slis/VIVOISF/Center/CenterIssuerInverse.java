package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterIssuerInverseIterator theCenterIssuerInverseIterator = (CenterIssuerInverseIterator)findAncestorWithClass(this, CenterIssuerInverseIterator.class);
			pageContext.getOut().print(theCenterIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for issuer tag ");
		}
		return SKIP_BODY;
	}
}

