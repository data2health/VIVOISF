package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentReviewOfIterator thePersonalCommunicationDocumentReviewOfIterator = (PersonalCommunicationDocumentReviewOfIterator)findAncestorWithClass(this, PersonalCommunicationDocumentReviewOfIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}
