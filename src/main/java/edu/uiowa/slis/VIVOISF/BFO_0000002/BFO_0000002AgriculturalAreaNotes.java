package edu.uiowa.slis.VIVOISF.BFO_0000002;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000002AgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000002AgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000002AgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000002AgriculturalAreaNotesIterator theBFO_0000002 = (BFO_0000002AgriculturalAreaNotesIterator)findAncestorWithClass(this, BFO_0000002AgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theBFO_0000002.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000002 for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000002 for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

