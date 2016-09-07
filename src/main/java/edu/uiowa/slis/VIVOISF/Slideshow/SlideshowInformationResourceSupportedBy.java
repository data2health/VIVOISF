package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowInformationResourceSupportedByIterator theSlideshowInformationResourceSupportedByIterator = (SlideshowInformationResourceSupportedByIterator)findAncestorWithClass(this, SlideshowInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theSlideshowInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}
