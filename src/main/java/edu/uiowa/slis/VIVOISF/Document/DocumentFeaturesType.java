package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentFeaturesIterator theDocumentFeaturesIterator = (DocumentFeaturesIterator)findAncestorWithClass(this, DocumentFeaturesIterator.class);
			pageContext.getOut().print(theDocumentFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for features tag ");
		}
		return SKIP_BODY;
	}
}
