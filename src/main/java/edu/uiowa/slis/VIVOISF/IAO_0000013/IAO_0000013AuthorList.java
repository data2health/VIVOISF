package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013AuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013AuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013AuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013AuthorListIterator theIAO_0000013AuthorListIterator = (IAO_0000013AuthorListIterator)findAncestorWithClass(this, IAO_0000013AuthorListIterator.class);
			pageContext.getOut().print(theIAO_0000013AuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for authorList tag ");
		}
		return SKIP_BODY;
	}
}
