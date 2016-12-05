package edu.uiowa.slis.VIVOISF.Database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatabaseOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatabaseOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatabaseOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatabaseOwnerIterator theDatabaseOwnerIterator = (DatabaseOwnerIterator)findAncestorWithClass(this, DatabaseOwnerIterator.class);
			pageContext.getOut().print(theDatabaseOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Database for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Database for owner tag ");
		}
		return SKIP_BODY;
	}
}
