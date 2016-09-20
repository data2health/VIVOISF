package edu.uiowa.slis.VIVOISF.Key;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KeyHasKeyInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KeyHasKeyInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(KeyHasKeyInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KeyHasKeyInverseIterator theKeyHasKeyInverseIterator = (KeyHasKeyInverseIterator)findAncestorWithClass(this, KeyHasKeyInverseIterator.class);
			pageContext.getOut().print(theKeyHasKeyInverseIterator.getHasKeyInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Key for hasKey tag ", e);
			throw new JspTagException("Error: Can't find enclosing Key for hasKey tag ");
		}
		return SKIP_BODY;
	}
}

