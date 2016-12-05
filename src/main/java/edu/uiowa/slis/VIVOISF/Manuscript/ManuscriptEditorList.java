package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptEditorListIterator theManuscriptEditorListIterator = (ManuscriptEditorListIterator)findAncestorWithClass(this, ManuscriptEditorListIterator.class);
			pageContext.getOut().print(theManuscriptEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for editorList tag ");
		}
		return SKIP_BODY;
	}
}
