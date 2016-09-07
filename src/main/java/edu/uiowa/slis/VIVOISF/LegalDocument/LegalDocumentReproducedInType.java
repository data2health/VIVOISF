package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentReproducedInIterator theLegalDocumentReproducedInIterator = (LegalDocumentReproducedInIterator)findAncestorWithClass(this, LegalDocumentReproducedInIterator.class);
			pageContext.getOut().print(theLegalDocumentReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}
