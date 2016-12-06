package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterNameShortESIterator theChapter = (ChapterNameShortESIterator)findAncestorWithClass(this, ChapterNameShortESIterator.class);
			pageContext.getOut().print(theChapter.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}
