package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartHasPublicationVenueIterator theDocumentPartHasPublicationVenueIterator = (DocumentPartHasPublicationVenueIterator)findAncestorWithClass(this, DocumentPartHasPublicationVenueIterator.class);
			pageContext.getOut().print(theDocumentPartHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

