package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseEditorListIterator theDatabaseEditorListIterator = (DatabaseEditorListIterator)findAncestorWithClass(this, DatabaseEditorListIterator.class);
			pageContext.getOut().print(theDatabaseEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for editorList tag ");
		}
		return SKIP_BODY;
	}
}
