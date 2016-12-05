package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicSuffixNameIterator theNonFacultyAcademic = (NonFacultyAcademicSuffixNameIterator)findAncestorWithClass(this, NonFacultyAcademicSuffixNameIterator.class);
			pageContext.getOut().print(theNonFacultyAcademic.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for suffixName tag ");
		}
		return SKIP_BODY;
	}
}
