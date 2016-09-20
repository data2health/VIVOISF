package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumIssuerInverseIterator theMuseumIssuerInverseIterator = (MuseumIssuerInverseIterator)findAncestorWithClass(this, MuseumIssuerInverseIterator.class);
			pageContext.getOut().print(theMuseumIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for issuer tag ");
		}
		return SKIP_BODY;
	}
}

