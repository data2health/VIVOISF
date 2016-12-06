package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentHasAddressIterator theDocumentHasAddressIterator = (DocumentHasAddressIterator)findAncestorWithClass(this, DocumentHasAddressIterator.class);
			pageContext.getOut().print(theDocumentHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

