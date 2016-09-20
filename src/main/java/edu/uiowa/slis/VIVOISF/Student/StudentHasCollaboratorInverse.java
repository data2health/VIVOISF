package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentHasCollaboratorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentHasCollaboratorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentHasCollaboratorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentHasCollaboratorInverseIterator theStudentHasCollaboratorInverseIterator = (StudentHasCollaboratorInverseIterator)findAncestorWithClass(this, StudentHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theStudentHasCollaboratorInverseIterator.getHasCollaboratorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

