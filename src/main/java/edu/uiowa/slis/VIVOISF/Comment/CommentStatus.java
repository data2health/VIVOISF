package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentStatusIterator theCommentStatusIterator = (CommentStatusIterator)findAncestorWithClass(this, CommentStatusIterator.class);
			pageContext.getOut().print(theCommentStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for status tag ");
		}
		return SKIP_BODY;
	}
}
