package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowPublisherIterator theSlideshowPublisherIterator = (SlideshowPublisherIterator)findAncestorWithClass(this, SlideshowPublisherIterator.class);
			pageContext.getOut().print(theSlideshowPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for publisher tag ");
		}
		return SKIP_BODY;
	}
}
