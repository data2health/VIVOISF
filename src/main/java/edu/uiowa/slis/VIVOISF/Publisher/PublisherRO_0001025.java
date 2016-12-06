package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherRO_0001025Iterator thePublisherRO_0001025Iterator = (PublisherRO_0001025Iterator)findAncestorWithClass(this, PublisherRO_0001025Iterator.class);
			pageContext.getOut().print(thePublisherRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}
