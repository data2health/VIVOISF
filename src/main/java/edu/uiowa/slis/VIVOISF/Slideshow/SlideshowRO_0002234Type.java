package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowRO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowRO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowRO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowRO_0002234Iterator theSlideshowRO_0002234Iterator = (SlideshowRO_0002234Iterator)findAncestorWithClass(this, SlideshowRO_0002234Iterator.class);
			pageContext.getOut().print(theSlideshowRO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

