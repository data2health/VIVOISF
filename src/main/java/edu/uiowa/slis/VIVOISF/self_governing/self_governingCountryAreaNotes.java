package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingCountryAreaNotesIterator theself_governing = (self_governingCountryAreaNotesIterator)findAncestorWithClass(this, self_governingCountryAreaNotesIterator.class);
			pageContext.getOut().print(theself_governing.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}
