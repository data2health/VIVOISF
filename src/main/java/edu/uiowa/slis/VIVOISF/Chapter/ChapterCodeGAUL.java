package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ChapterCodeGAULIterator theChapter = (ChapterCodeGAULIterator)findAncestorWithClass(this, ChapterCodeGAULIterator.class);
			pageContext.getOut().print(theChapter.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}
