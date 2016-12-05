package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteCourtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteCourtType currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteCourtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteCourtIterator theStatuteCourtIterator = (StatuteCourtIterator)findAncestorWithClass(this, StatuteCourtIterator.class);
			pageContext.getOut().print(theStatuteCourtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for court tag ");
		}
		return SKIP_BODY;
	}
}
