package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterCitesIterator theConferencePosterCitesIterator = (ConferencePosterCitesIterator)findAncestorWithClass(this, ConferencePosterCitesIterator.class);
			pageContext.getOut().print(theConferencePosterCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for cites tag ");
		}
		return SKIP_BODY;
	}
}
