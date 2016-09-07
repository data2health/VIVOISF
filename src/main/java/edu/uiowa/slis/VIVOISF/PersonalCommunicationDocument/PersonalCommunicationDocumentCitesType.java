package edu.uiowa.slis.VIVOISF.PersonalCommunicationDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationDocumentCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationDocumentCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationDocumentCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationDocumentCitesIterator thePersonalCommunicationDocumentCitesIterator = (PersonalCommunicationDocumentCitesIterator)findAncestorWithClass(this, PersonalCommunicationDocumentCitesIterator.class);
			pageContext.getOut().print(thePersonalCommunicationDocumentCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunicationDocument for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunicationDocument for cites tag ");
		}
		return SKIP_BODY;
	}
}
