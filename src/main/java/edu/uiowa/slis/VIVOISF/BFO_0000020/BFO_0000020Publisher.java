package edu.uiowa.slis.VIVOISF.BFO_0000020;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000020Publisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000020Publisher currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000020Publisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000020PublisherIterator theBFO_0000020PublisherIterator = (BFO_0000020PublisherIterator)findAncestorWithClass(this, BFO_0000020PublisherIterator.class);
			pageContext.getOut().print(theBFO_0000020PublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000020 for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000020 for publisher tag ");
		}
		return SKIP_BODY;
	}
}
