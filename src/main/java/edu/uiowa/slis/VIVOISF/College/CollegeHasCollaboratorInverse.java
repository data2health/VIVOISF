package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeHasCollaboratorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeHasCollaboratorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeHasCollaboratorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeHasCollaboratorInverseIterator theCollegeHasCollaboratorInverseIterator = (CollegeHasCollaboratorInverseIterator)findAncestorWithClass(this, CollegeHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theCollegeHasCollaboratorInverseIterator.getHasCollaboratorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing College for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}
