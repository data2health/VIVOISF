package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionHasMinLatitudeIterator thePrimaryPosition = (PrimaryPositionHasMinLatitudeIterator)findAncestorWithClass(this, PrimaryPositionHasMinLatitudeIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

