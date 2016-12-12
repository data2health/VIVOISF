package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaIsPredecessorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaIsPredecessorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaIsPredecessorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AreaIsPredecessorOfIterator theAreaIsPredecessorOfIterator = (AreaIsPredecessorOfIterator)findAncestorWithClass(this, AreaIsPredecessorOfIterator.class);
			pageContext.getOut().print(theAreaIsPredecessorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for isPredecessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for isPredecessorOf tag ");
		}
		return SKIP_BODY;
	}
}

