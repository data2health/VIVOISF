package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNameListZHIterator theSlideshow = (SlideshowNameListZHIterator)findAncestorWithClass(this, SlideshowNameListZHIterator.class);
			pageContext.getOut().print(theSlideshow.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}
