package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionHasEmailIterator theFacultyAdministrativePositionHasEmailIterator = (FacultyAdministrativePositionHasEmailIterator)findAncestorWithClass(this, FacultyAdministrativePositionHasEmailIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}
