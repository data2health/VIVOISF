package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionPopulationNotesIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionPopulationNotesIterator)findAncestorWithClass(this, NonFacultyAcademicPositionPopulationNotesIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}
