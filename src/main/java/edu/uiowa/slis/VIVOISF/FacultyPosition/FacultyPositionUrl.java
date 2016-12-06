package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionUrlIterator theFacultyPosition = (FacultyPositionUrlIterator)findAncestorWithClass(this, FacultyPositionUrlIterator.class);
			pageContext.getOut().print(theFacultyPosition.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for url tag ");
		}
		return SKIP_BODY;
	}
}
