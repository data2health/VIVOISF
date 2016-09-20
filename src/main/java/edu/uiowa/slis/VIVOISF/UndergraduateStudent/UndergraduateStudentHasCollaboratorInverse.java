package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentHasCollaboratorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentHasCollaboratorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentHasCollaboratorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentHasCollaboratorInverseIterator theUndergraduateStudentHasCollaboratorInverseIterator = (UndergraduateStudentHasCollaboratorInverseIterator)findAncestorWithClass(this, UndergraduateStudentHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theUndergraduateStudentHasCollaboratorInverseIterator.getHasCollaboratorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

