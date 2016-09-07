package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseStatusIterator theNewsReleaseStatusIterator = (NewsReleaseStatusIterator)findAncestorWithClass(this, NewsReleaseStatusIterator.class);
			pageContext.getOut().print(theNewsReleaseStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for status tag ");
		}
		return SKIP_BODY;
	}
}
