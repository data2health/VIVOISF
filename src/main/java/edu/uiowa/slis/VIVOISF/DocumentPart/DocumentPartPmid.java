package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartPmidIterator theDocumentPart = (DocumentPartPmidIterator)findAncestorWithClass(this, DocumentPartPmidIterator.class);
			pageContext.getOut().print(theDocumentPart.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for pmid tag ");
		}
		return SKIP_BODY;
	}
}
