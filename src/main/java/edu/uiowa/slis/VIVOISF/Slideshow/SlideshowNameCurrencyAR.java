package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNameCurrencyARIterator theSlideshow = (SlideshowNameCurrencyARIterator)findAncestorWithClass(this, SlideshowNameCurrencyARIterator.class);
			pageContext.getOut().print(theSlideshow.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

