package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionBFO_0000051Iterator theFacultyPositionBFO_0000051Iterator = (FacultyPositionBFO_0000051Iterator)findAncestorWithClass(this, FacultyPositionBFO_0000051Iterator.class);
			pageContext.getOut().print(theFacultyPositionBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

