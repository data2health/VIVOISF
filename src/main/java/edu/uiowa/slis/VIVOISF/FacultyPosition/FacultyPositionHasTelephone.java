package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionHasTelephoneIterator theFacultyPositionHasTelephoneIterator = (FacultyPositionHasTelephoneIterator)findAncestorWithClass(this, FacultyPositionHasTelephoneIterator.class);
			pageContext.getOut().print(theFacultyPositionHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

