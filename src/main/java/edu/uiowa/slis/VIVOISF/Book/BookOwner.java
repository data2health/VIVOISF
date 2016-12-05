package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(BookOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookOwnerIterator theBookOwnerIterator = (BookOwnerIterator)findAncestorWithClass(this, BookOwnerIterator.class);
			pageContext.getOut().print(theBookOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for owner tag ");
		}
		return SKIP_BODY;
	}
}
