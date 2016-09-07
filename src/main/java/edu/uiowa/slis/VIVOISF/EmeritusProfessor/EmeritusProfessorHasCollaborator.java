package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorHasCollaboratorIterator theEmeritusProfessorHasCollaboratorIterator = (EmeritusProfessorHasCollaboratorIterator)findAncestorWithClass(this, EmeritusProfessorHasCollaboratorIterator.class);
			pageContext.getOut().print(theEmeritusProfessorHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}
