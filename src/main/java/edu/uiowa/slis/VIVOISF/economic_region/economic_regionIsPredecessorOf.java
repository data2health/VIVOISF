package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionIsPredecessorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionIsPredecessorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionIsPredecessorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionIsPredecessorOfIterator theeconomic_regionIsPredecessorOfIterator = (economic_regionIsPredecessorOfIterator)findAncestorWithClass(this, economic_regionIsPredecessorOfIterator.class);
			pageContext.getOut().print(theeconomic_regionIsPredecessorOfIterator.getIsPredecessorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for isPredecessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for isPredecessorOf tag ");
		}
		return SKIP_BODY;
	}
}
