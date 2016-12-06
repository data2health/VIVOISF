package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionNameOfficialESIterator theFacultyPosition = (FacultyPositionNameOfficialESIterator)findAncestorWithClass(this, FacultyPositionNameOfficialESIterator.class);
			pageContext.getOut().print(theFacultyPosition.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}
