package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartRO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartRO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartRO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartRO_0002234Iterator theDocumentPartRO_0002234Iterator = (DocumentPartRO_0002234Iterator)findAncestorWithClass(this, DocumentPartRO_0002234Iterator.class);
			pageContext.getOut().print(theDocumentPartRO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

