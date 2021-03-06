package edu.uiowa.slis.VIVOISF.SymmetricProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SymmetricPropertyDisplayLimitAnnot extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SymmetricPropertyDisplayLimitAnnot currentInstance = null;
	private static final Log log = LogFactory.getLog(SymmetricPropertyDisplayLimitAnnot.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SymmetricPropertyDisplayLimitAnnotIterator theSymmetricProperty = (SymmetricPropertyDisplayLimitAnnotIterator)findAncestorWithClass(this, SymmetricPropertyDisplayLimitAnnotIterator.class);
			pageContext.getOut().print(theSymmetricProperty.getDisplayLimitAnnot());
		} catch (Exception e) {
			log.error("Can't find enclosing SymmetricProperty for displayLimitAnnot tag ", e);
			throw new JspTagException("Error: Can't find enclosing SymmetricProperty for displayLimitAnnot tag ");
		}
		return SKIP_BODY;
	}
}

