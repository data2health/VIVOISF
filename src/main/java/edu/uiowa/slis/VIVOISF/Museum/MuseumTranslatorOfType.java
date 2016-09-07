package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumTranslatorOfIterator theMuseumTranslatorOfIterator = (MuseumTranslatorOfIterator)findAncestorWithClass(this, MuseumTranslatorOfIterator.class);
			pageContext.getOut().print(theMuseumTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}
