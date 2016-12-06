package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowHasSubjectAreaIterator theSlideshowHasSubjectAreaIterator = (SlideshowHasSubjectAreaIterator)findAncestorWithClass(this, SlideshowHasSubjectAreaIterator.class);
			pageContext.getOut().print(theSlideshowHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}
