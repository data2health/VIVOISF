package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasTelephoneIterator theJournalHasTelephoneIterator = (JournalHasTelephoneIterator)findAncestorWithClass(this, JournalHasTelephoneIterator.class);
			pageContext.getOut().print(theJournalHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

