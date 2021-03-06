package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingValidUntil extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingValidUntil currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingValidUntil.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingValidUntilIterator theSelf_governing = (Self_governingValidUntilIterator)findAncestorWithClass(this, Self_governingValidUntilIterator.class);
			pageContext.getOut().print(theSelf_governing.getValidUntil());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for validUntil tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for validUntil tag ");
		}
		return SKIP_BODY;
	}
}

