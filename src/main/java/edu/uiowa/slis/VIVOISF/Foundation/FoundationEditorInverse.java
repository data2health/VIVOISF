package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationEditorInverseIterator theFoundationEditorInverseIterator = (FoundationEditorInverseIterator)findAncestorWithClass(this, FoundationEditorInverseIterator.class);
			pageContext.getOut().print(theFoundationEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for editor tag ");
		}
		return SKIP_BODY;
	}
}
