package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionRO_0001025Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionRO_0001025Type currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionRO_0001025Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionRO_0001025Iterator theLibrarianPositionRO_0001025Iterator = (LibrarianPositionRO_0001025Iterator)findAncestorWithClass(this, LibrarianPositionRO_0001025Iterator.class);
			pageContext.getOut().print(theLibrarianPositionRO_0001025Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}
