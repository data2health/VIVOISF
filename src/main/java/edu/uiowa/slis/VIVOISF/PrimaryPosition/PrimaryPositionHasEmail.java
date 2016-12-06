package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionHasEmailIterator thePrimaryPositionHasEmailIterator = (PrimaryPositionHasEmailIterator)findAncestorWithClass(this, PrimaryPositionHasEmailIterator.class);
			pageContext.getOut().print(thePrimaryPositionHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

