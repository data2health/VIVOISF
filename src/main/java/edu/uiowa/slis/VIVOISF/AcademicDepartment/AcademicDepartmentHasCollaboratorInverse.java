package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentHasCollaboratorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentHasCollaboratorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentHasCollaboratorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentHasCollaboratorInverseIterator theAcademicDepartmentHasCollaboratorInverseIterator = (AcademicDepartmentHasCollaboratorInverseIterator)findAncestorWithClass(this, AcademicDepartmentHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theAcademicDepartmentHasCollaboratorInverseIterator.getHasCollaboratorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}
