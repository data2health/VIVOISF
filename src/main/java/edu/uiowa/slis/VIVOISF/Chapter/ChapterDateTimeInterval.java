package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterDateTimeIntervalIterator theChapterDateTimeIntervalIterator = (ChapterDateTimeIntervalIterator)findAncestorWithClass(this, ChapterDateTimeIntervalIterator.class);
			pageContext.getOut().print(theChapterDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}
