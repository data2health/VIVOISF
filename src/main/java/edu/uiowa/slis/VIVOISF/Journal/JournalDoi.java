package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalDoiIterator theJournal = (JournalDoiIterator)findAncestorWithClass(this, JournalDoiIterator.class);
			pageContext.getOut().print(theJournal.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for doi tag ");
		}
		return SKIP_BODY;
	}
}
