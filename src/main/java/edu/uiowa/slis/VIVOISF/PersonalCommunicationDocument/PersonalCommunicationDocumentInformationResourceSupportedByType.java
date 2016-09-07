package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentInformationResourceSupportedByIterator thePersonalCommunicationDocumentInformationResourceSupportedByIterator = (PersonalCommunicationDocumentInformationResourceSupportedByIterator)findAncestorWithClass(this, PersonalCommunicationDocumentInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}
