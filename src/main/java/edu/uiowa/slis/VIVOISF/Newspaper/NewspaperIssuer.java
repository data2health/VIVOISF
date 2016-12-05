package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperIssuerIterator theNewspaperIssuerIterator = (NewspaperIssuerIterator)findAncestorWithClass(this, NewspaperIssuerIterator.class);
			pageContext.getOut().print(theNewspaperIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for issuer tag ");
		}
		return SKIP_BODY;
	}
}
