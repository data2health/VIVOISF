package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumIssuerInverseIterator theConsortiumIssuerInverseIterator = (ConsortiumIssuerInverseIterator)findAncestorWithClass(this, ConsortiumIssuerInverseIterator.class);
			pageContext.getOut().print(theConsortiumIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for issuer tag ");
		}
		return SKIP_BODY;
	}
}

