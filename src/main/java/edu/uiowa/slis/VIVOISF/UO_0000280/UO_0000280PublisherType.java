package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280PublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280PublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280PublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UO_0000280PublisherIterator theUO_0000280PublisherIterator = (UO_0000280PublisherIterator)findAncestorWithClass(this, UO_0000280PublisherIterator.class);
			pageContext.getOut().print(theUO_0000280PublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for publisher tag ");
		}
		return SKIP_BODY;
	}
}

