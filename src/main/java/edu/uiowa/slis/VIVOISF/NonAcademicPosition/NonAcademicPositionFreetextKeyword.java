package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionFreetextKeywordIterator theNonAcademicPosition = (NonAcademicPositionFreetextKeywordIterator)findAncestorWithClass(this, NonAcademicPositionFreetextKeywordIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}
