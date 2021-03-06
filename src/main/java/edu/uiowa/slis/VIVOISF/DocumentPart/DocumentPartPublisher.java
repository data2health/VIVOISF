package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartPublisherIterator theDocumentPartPublisherIterator = (DocumentPartPublisherIterator)findAncestorWithClass(this, DocumentPartPublisherIterator.class);
			pageContext.getOut().print(theDocumentPartPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for publisher tag ");
		}
		return SKIP_BODY;
	}
}

