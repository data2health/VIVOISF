package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartIssuerIterator theDocumentPartIssuerIterator = (DocumentPartIssuerIterator)findAncestorWithClass(this, DocumentPartIssuerIterator.class);
			pageContext.getOut().print(theDocumentPartIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for issuer tag ");
		}
		return SKIP_BODY;
	}
}
