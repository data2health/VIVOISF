package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalProducerIterator theJournalProducerIterator = (JournalProducerIterator)findAncestorWithClass(this, JournalProducerIterator.class);
			pageContext.getOut().print(theJournalProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for producer tag ");
		}
		return SKIP_BODY;
	}
}
