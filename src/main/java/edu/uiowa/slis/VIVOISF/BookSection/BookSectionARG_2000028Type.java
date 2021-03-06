package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionARG_2000028Iterator theBookSectionARG_2000028Iterator = (BookSectionARG_2000028Iterator)findAncestorWithClass(this, BookSectionARG_2000028Iterator.class);
			pageContext.getOut().print(theBookSectionARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

