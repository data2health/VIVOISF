package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsOwnerIterator theProceedingsOwnerIterator = (ProceedingsOwnerIterator)findAncestorWithClass(this, ProceedingsOwnerIterator.class);
			pageContext.getOut().print(theProceedingsOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for owner tag ");
		}
		return SKIP_BODY;
	}
}
