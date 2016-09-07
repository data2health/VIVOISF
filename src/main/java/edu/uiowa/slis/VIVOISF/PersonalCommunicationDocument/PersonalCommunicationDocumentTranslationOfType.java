package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentTranslationOfIterator thePersonalCommunicationDocumentTranslationOfIterator = (PersonalCommunicationDocumentTranslationOfIterator)findAncestorWithClass(this, PersonalCommunicationDocumentTranslationOfIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for translationOf tag ");
		}
		return SKIP_BODY;
	}
}
