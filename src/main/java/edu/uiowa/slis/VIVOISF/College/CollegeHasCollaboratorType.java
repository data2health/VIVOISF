package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeHasCollaboratorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeHasCollaboratorType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeHasCollaboratorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeHasCollaboratorIterator theCollegeHasCollaboratorIterator = (CollegeHasCollaboratorIterator)findAncestorWithClass(this, CollegeHasCollaboratorIterator.class);
			pageContext.getOut().print(theCollegeHasCollaboratorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing College for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}
