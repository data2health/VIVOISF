package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentUpcIterator theDocument = (DocumentUpcIterator)findAncestorWithClass(this, DocumentUpcIterator.class);
			pageContext.getOut().print(theDocument.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for upc tag ");
		}
		return SKIP_BODY;
	}
}

