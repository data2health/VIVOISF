package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowIAO_0000136Iterator theSlideshowIAO_0000136Iterator = (SlideshowIAO_0000136Iterator)findAncestorWithClass(this, SlideshowIAO_0000136Iterator.class);
			pageContext.getOut().print(theSlideshowIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}
