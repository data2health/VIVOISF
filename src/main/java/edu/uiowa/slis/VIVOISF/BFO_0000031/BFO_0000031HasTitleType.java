package edu.uiowa.slis.VIVOISF.BFO_0000031;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000031HasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000031HasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000031HasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000031HasTitleIterator theBFO_0000031HasTitleIterator = (BFO_0000031HasTitleIterator)findAncestorWithClass(this, BFO_0000031HasTitleIterator.class);
			pageContext.getOut().print(theBFO_0000031HasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000031 for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000031 for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

