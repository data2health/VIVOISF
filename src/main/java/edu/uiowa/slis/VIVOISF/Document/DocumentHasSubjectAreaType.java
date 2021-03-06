package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentHasSubjectAreaIterator theDocumentHasSubjectAreaIterator = (DocumentHasSubjectAreaIterator)findAncestorWithClass(this, DocumentHasSubjectAreaIterator.class);
			pageContext.getOut().print(theDocumentHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

