package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalPublisherIterator theJournalPublisherIterator = (JournalPublisherIterator)findAncestorWithClass(this, JournalPublisherIterator.class);
			pageContext.getOut().print(theJournalPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for publisher tag ");
		}
		return SKIP_BODY;
	}
}

