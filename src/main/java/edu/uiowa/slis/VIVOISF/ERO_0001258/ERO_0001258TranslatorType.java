package edu.uiowa.slis.VIVOISF.ERO_0001258;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001258TranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001258TranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001258TranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0001258TranslatorIterator theERO_0001258TranslatorIterator = (ERO_0001258TranslatorIterator)findAncestorWithClass(this, ERO_0001258TranslatorIterator.class);
			pageContext.getOut().print(theERO_0001258TranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001258 for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001258 for translator tag ");
		}
		return SKIP_BODY;
	}
}
