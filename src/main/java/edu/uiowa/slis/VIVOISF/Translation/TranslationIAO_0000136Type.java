package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslationIAO_0000136Iterator theTranslationIAO_0000136Iterator = (TranslationIAO_0000136Iterator)findAncestorWithClass(this, TranslationIAO_0000136Iterator.class);
			pageContext.getOut().print(theTranslationIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}
