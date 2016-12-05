package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterEditionIterator theConferencePoster = (ConferencePosterEditionIterator)findAncestorWithClass(this, ConferencePosterEditionIterator.class);
			pageContext.getOut().print(theConferencePoster.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for edition tag ");
		}
		return SKIP_BODY;
	}
}
