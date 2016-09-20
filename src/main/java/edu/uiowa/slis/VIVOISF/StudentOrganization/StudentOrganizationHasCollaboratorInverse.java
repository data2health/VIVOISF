package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationHasCollaboratorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationHasCollaboratorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationHasCollaboratorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationHasCollaboratorInverseIterator theStudentOrganizationHasCollaboratorInverseIterator = (StudentOrganizationHasCollaboratorInverseIterator)findAncestorWithClass(this, StudentOrganizationHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theStudentOrganizationHasCollaboratorInverseIterator.getHasCollaboratorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

