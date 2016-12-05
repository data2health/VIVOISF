package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationDirectorInverseIterator theStudentOrganizationDirectorInverseIterator = (StudentOrganizationDirectorInverseIterator)findAncestorWithClass(this, StudentOrganizationDirectorInverseIterator.class);
			pageContext.getOut().print(theStudentOrganizationDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for director tag ");
		}
		return SKIP_BODY;
	}
}
