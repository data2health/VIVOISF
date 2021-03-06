package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterPageStartIterator theChapter = (ChapterPageStartIterator)findAncestorWithClass(this, ChapterPageStartIterator.class);
			pageContext.getOut().print(theChapter.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

