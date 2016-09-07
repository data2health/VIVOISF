package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoCitedByIterator theVideoCitedByIterator = (VideoCitedByIterator)findAncestorWithClass(this, VideoCitedByIterator.class);
			pageContext.getOut().print(theVideoCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for citedBy tag ");
		}
		return SKIP_BODY;
	}
}
