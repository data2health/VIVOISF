package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009CountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009CountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009CountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009CountryAreaNotesIterator theIAO_0000009 = (IAO_0000009CountryAreaNotesIterator)findAncestorWithClass(this, IAO_0000009CountryAreaNotesIterator.class);
			pageContext.getOut().print(theIAO_0000009.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

