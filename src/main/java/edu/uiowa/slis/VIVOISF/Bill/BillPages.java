package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillPages currentInstance = null;
	private static final Log log = LogFactory.getLog(BillPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BillPagesIterator theBill = (BillPagesIterator)findAncestorWithClass(this, BillPagesIterator.class);
			pageContext.getOut().print(theBill.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for pages tag ");
		}
		return SKIP_BODY;
	}
}
