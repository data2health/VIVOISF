package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionLandAreaYearIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionLandAreaYearIterator)findAncestorWithClass(this, FacultyAdministrativePositionLandAreaYearIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}
