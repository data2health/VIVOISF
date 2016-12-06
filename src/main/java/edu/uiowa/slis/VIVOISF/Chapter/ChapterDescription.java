package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterDescriptionIterator theChapter = (ChapterDescriptionIterator)findAncestorWithClass(this, ChapterDescriptionIterator.class);
			pageContext.getOut().print(theChapter.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for description tag ");
		}
		return SKIP_BODY;
	}
}

