package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsDocumentationForIterator theProceedingsDocumentationForIterator = (ProceedingsDocumentationForIterator)findAncestorWithClass(this, ProceedingsDocumentationForIterator.class);
			pageContext.getOut().print(theProceedingsDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}
