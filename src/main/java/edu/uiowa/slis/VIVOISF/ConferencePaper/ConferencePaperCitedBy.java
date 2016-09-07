package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperCitedByIterator theConferencePaperCitedByIterator = (ConferencePaperCitedByIterator)findAncestorWithClass(this, ConferencePaperCitedByIterator.class);
			pageContext.getOut().print(theConferencePaperCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for citedBy tag ");
		}
		return SKIP_BODY;
	}
}
