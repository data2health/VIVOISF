package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChapterRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChapterRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ChapterRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ChapterRelatedByIterator theChapterRelatedByIterator = (ChapterRelatedByIterator)findAncestorWithClass(this, ChapterRelatedByIterator.class);
			pageContext.getOut().print(theChapterRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Chapter for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Chapter for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

