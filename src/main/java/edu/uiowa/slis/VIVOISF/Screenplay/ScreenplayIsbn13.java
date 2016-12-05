package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayIsbn13Iterator theScreenplay = (ScreenplayIsbn13Iterator)findAncestorWithClass(this, ScreenplayIsbn13Iterator.class);
			pageContext.getOut().print(theScreenplay.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}
