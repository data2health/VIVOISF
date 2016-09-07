package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogRO_0002353Iterator theBlogRO_0002353Iterator = (BlogRO_0002353Iterator)findAncestorWithClass(this, BlogRO_0002353Iterator.class);
			pageContext.getOut().print(theBlogRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}
