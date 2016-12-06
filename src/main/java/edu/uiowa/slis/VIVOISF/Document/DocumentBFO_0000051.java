package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentBFO_0000051Iterator theDocumentBFO_0000051Iterator = (DocumentBFO_0000051Iterator)findAncestorWithClass(this, DocumentBFO_0000051Iterator.class);
			pageContext.getOut().print(theDocumentBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

