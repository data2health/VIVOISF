package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentTranslatorIterator thePatentTranslatorIterator = (PatentTranslatorIterator)findAncestorWithClass(this, PatentTranslatorIterator.class);
			pageContext.getOut().print(thePatentTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for translator tag ");
		}
		return SKIP_BODY;
	}
}
