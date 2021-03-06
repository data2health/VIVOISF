package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentDoiIterator theDocument = (DocumentDoiIterator)findAncestorWithClass(this, DocumentDoiIterator.class);
			pageContext.getOut().print(theDocument.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for doi tag ");
		}
		return SKIP_BODY;
	}
}

