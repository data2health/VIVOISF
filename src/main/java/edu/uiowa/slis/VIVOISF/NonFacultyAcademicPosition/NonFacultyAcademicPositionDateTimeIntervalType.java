package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionDateTimeIntervalIterator theNonFacultyAcademicPositionDateTimeIntervalIterator = (NonFacultyAcademicPositionDateTimeIntervalIterator)findAncestorWithClass(this, NonFacultyAcademicPositionDateTimeIntervalIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

