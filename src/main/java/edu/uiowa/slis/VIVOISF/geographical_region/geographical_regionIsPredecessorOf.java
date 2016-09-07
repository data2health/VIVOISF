package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionIsPredecessorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionIsPredecessorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionIsPredecessorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionIsPredecessorOfIterator thegeographical_regionIsPredecessorOfIterator = (geographical_regionIsPredecessorOfIterator)findAncestorWithClass(this, geographical_regionIsPredecessorOfIterator.class);
			pageContext.getOut().print(thegeographical_regionIsPredecessorOfIterator.getIsPredecessorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for isPredecessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for isPredecessorOf tag ");
		}
		return SKIP_BODY;
	}
}
