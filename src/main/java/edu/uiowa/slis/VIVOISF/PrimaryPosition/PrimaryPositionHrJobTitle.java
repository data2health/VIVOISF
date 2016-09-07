package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionHrJobTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionHrJobTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionHrJobTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionHrJobTitleIterator thePrimaryPosition = (PrimaryPositionHrJobTitleIterator)findAncestorWithClass(this, PrimaryPositionHrJobTitleIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getHrJobTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for hrJobTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for hrJobTitle tag ");
		}
		return SKIP_BODY;
	}
}
