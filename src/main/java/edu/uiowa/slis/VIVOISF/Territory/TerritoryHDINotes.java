package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryHDINotesIterator theTerritory = (TerritoryHDINotesIterator)findAncestorWithClass(this, TerritoryHDINotesIterator.class);
			pageContext.getOut().print(theTerritory.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

