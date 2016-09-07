package edu.uiowa.slis.VIVOISF.ARG_2000008;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000008Translator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000008Translator currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000008Translator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000008TranslatorIterator theARG_2000008TranslatorIterator = (ARG_2000008TranslatorIterator)findAncestorWithClass(this, ARG_2000008TranslatorIterator.class);
			pageContext.getOut().print(theARG_2000008TranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000008 for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000008 for translator tag ");
		}
		return SKIP_BODY;
	}
}
