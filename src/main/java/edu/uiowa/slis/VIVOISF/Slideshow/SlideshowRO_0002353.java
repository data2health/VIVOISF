package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowRO_0002353 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowRO_0002353 currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowRO_0002353.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowRO_0002353Iterator theSlideshow = (SlideshowRO_0002353Iterator)findAncestorWithClass(this, SlideshowRO_0002353Iterator.class);
			pageContext.getOut().print(theSlideshow.getRO_0002353());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

