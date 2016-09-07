package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentStatusIterator theLegalDocumentStatusIterator = (LegalDocumentStatusIterator)findAncestorWithClass(this, LegalDocumentStatusIterator.class);
			pageContext.getOut().print(theLegalDocumentStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for status tag ");
		}
		return SKIP_BODY;
	}
}
