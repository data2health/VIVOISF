package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionCodeFAOTERMIterator theLibrarianPosition = (LibrarianPositionCodeFAOTERMIterator)findAncestorWithClass(this, LibrarianPositionCodeFAOTERMIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}
