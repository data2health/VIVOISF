package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteCitedByIterator theNoteCitedByIterator = (NoteCitedByIterator)findAncestorWithClass(this, NoteCitedByIterator.class);
			pageContext.getOut().print(theNoteCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for citedBy tag ");
		}
		return SKIP_BODY;
	}
}
