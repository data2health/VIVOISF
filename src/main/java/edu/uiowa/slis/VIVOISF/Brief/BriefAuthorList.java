package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefAuthorListIterator theBriefAuthorListIterator = (BriefAuthorListIterator)findAncestorWithClass(this, BriefAuthorListIterator.class);
			pageContext.getOut().print(theBriefAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for authorList tag ");
		}
		return SKIP_BODY;
	}
}
