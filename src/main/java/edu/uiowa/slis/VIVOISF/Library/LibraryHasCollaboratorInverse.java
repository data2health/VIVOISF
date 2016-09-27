package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryHasCollaboratorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryHasCollaboratorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryHasCollaboratorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryHasCollaboratorInverseIterator theLibraryHasCollaboratorInverseIterator = (LibraryHasCollaboratorInverseIterator)findAncestorWithClass(this, LibraryHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theLibraryHasCollaboratorInverseIterator.getHasCollaboratorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}
