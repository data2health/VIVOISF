package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentFeaturesIterator theLegalDocumentFeaturesIterator = (LegalDocumentFeaturesIterator)findAncestorWithClass(this, LegalDocumentFeaturesIterator.class);
			pageContext.getOut().print(theLegalDocumentFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for features tag ");
		}
		return SKIP_BODY;
	}
}
