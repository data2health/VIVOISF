package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionLandAreaNotesIterator thePrimaryPosition = (PrimaryPositionLandAreaNotesIterator)findAncestorWithClass(this, PrimaryPositionLandAreaNotesIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

