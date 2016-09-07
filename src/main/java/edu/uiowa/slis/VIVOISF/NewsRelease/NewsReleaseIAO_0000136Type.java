package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseIAO_0000136Iterator theNewsReleaseIAO_0000136Iterator = (NewsReleaseIAO_0000136Iterator)findAncestorWithClass(this, NewsReleaseIAO_0000136Iterator.class);
			pageContext.getOut().print(theNewsReleaseIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}
