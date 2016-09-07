package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationDocumentationForIterator theTranslationDocumentationForIterator = (TranslationDocumentationForIterator)findAncestorWithClass(this, TranslationDocumentationForIterator.class);
			pageContext.getOut().print(theTranslationDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}
