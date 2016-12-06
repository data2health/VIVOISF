package edu.uiowa.slis.VIVOISF.BFO_0000015;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000015PopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000015PopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000015PopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000015PopulationNotesIterator theBFO_0000015 = (BFO_0000015PopulationNotesIterator)findAncestorWithClass(this, BFO_0000015PopulationNotesIterator.class);
			pageContext.getOut().print(theBFO_0000015.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000015 for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000015 for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}
