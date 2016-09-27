package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewERO_0000045Iterator theReview = (ReviewERO_0000045Iterator)findAncestorWithClass(this, ReviewERO_0000045Iterator.class);
			pageContext.getOut().print(theReview.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}
