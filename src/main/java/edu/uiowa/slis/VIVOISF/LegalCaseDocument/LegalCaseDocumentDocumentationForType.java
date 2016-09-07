package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentDocumentationForIterator theLegalCaseDocumentDocumentationForIterator = (LegalCaseDocumentDocumentationForIterator)findAncestorWithClass(this, LegalCaseDocumentDocumentationForIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}
