package edu.uiowa.slis.VIVOISF.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class URLHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static URLHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(URLHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			URLHasEmailIterator theURLHasEmailIterator = (URLHasEmailIterator)findAncestorWithClass(this, URLHasEmailIterator.class);
			pageContext.getOut().print(theURLHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing URL for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing URL for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

