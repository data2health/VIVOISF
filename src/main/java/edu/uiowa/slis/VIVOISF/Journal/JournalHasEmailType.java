package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasEmailIterator theJournalHasEmailIterator = (JournalHasEmailIterator)findAncestorWithClass(this, JournalHasEmailIterator.class);
			pageContext.getOut().print(theJournalHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

