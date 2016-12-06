package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionCountryAreaUnitIterator theFacultyPosition = (FacultyPositionCountryAreaUnitIterator)findAncestorWithClass(this, FacultyPositionCountryAreaUnitIterator.class);
			pageContext.getOut().print(theFacultyPosition.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}
