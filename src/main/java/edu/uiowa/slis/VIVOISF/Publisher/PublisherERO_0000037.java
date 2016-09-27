package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherERO_0000037 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherERO_0000037 currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherERO_0000037.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherERO_0000037Iterator thePublisherERO_0000037Iterator = (PublisherERO_0000037Iterator)findAncestorWithClass(this, PublisherERO_0000037Iterator.class);
			pageContext.getOut().print(thePublisherERO_0000037Iterator.getERO_0000037());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}
