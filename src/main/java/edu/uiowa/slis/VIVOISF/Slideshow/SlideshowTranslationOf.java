package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowTranslationOfIterator theSlideshowTranslationOfIterator = (SlideshowTranslationOfIterator)findAncestorWithClass(this, SlideshowTranslationOfIterator.class);
			pageContext.getOut().print(theSlideshowTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for translationOf tag ");
		}
		return SKIP_BODY;
	}
}
