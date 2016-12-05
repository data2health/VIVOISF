package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedHasCoordinate extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedHasCoordinate currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedHasCoordinate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			disputedHasCoordinateIterator thedisputed = (disputedHasCoordinateIterator)findAncestorWithClass(this, disputedHasCoordinateIterator.class);
			pageContext.getOut().print(thedisputed.getHasCoordinate());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for hasCoordinate tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for hasCoordinate tag ");
		}
		return SKIP_BODY;
	}
}
