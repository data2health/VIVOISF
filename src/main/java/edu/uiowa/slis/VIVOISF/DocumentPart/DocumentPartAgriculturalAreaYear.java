package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartAgriculturalAreaYearIterator theDocumentPart = (DocumentPartAgriculturalAreaYearIterator)findAncestorWithClass(this, DocumentPartAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theDocumentPart.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

