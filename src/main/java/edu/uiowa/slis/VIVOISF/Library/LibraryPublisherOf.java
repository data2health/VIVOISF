package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryPublisherOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryPublisherOf currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryPublisherOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryPublisherOfIterator theLibraryPublisherOfIterator = (LibraryPublisherOfIterator)findAncestorWithClass(this, LibraryPublisherOfIterator.class);
			pageContext.getOut().print(theLibraryPublisherOfIterator.getPublisherOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}
