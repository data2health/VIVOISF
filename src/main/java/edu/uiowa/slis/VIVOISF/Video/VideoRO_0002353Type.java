package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoRO_0002353Iterator theVideoRO_0002353Iterator = (VideoRO_0002353Iterator)findAncestorWithClass(this, VideoRO_0002353Iterator.class);
			pageContext.getOut().print(theVideoRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}
