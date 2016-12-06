package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionCodeUNIterator theNonAcademicPosition = (NonAcademicPositionCodeUNIterator)findAncestorWithClass(this, NonAcademicPositionCodeUNIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for codeUN tag ");
		}
		return SKIP_BODY;
	}
}
