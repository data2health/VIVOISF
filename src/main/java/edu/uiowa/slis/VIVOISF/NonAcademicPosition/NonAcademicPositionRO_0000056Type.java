package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionRO_0000056Iterator theNonAcademicPositionRO_0000056Iterator = (NonAcademicPositionRO_0000056Iterator)findAncestorWithClass(this, NonAcademicPositionRO_0000056Iterator.class);
			pageContext.getOut().print(theNonAcademicPositionRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}
