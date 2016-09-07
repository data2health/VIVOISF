package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseCites currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseCitesIterator theNewsReleaseCitesIterator = (NewsReleaseCitesIterator)findAncestorWithClass(this, NewsReleaseCitesIterator.class);
			pageContext.getOut().print(theNewsReleaseCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for cites tag ");
		}
		return SKIP_BODY;
	}
}
