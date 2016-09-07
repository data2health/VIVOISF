package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideTranslationOfIterator theSlideTranslationOfIterator = (SlideTranslationOfIterator)findAncestorWithClass(this, SlideTranslationOfIterator.class);
			pageContext.getOut().print(theSlideTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for translationOf tag ");
		}
		return SKIP_BODY;
	}
}
