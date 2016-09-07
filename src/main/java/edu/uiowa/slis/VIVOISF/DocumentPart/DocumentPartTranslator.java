package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartTranslatorIterator theDocumentPartTranslatorIterator = (DocumentPartTranslatorIterator)findAncestorWithClass(this, DocumentPartTranslatorIterator.class);
			pageContext.getOut().print(theDocumentPartTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for translator tag ");
		}
		return SKIP_BODY;
	}
}
