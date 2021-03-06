package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingIsPredecessorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingIsPredecessorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingIsPredecessorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Self_governingIsPredecessorOfIterator theSelf_governingIsPredecessorOfIterator = (Self_governingIsPredecessorOfIterator)findAncestorWithClass(this, Self_governingIsPredecessorOfIterator.class);
			pageContext.getOut().print(theSelf_governingIsPredecessorOfIterator.getIsPredecessorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for isPredecessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for isPredecessorOf tag ");
		}
		return SKIP_BODY;
	}
}

