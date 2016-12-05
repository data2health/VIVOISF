package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperCodenIterator theWorkingPaper = (WorkingPaperCodenIterator)findAncestorWithClass(this, WorkingPaperCodenIterator.class);
			pageContext.getOut().print(theWorkingPaper.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for coden tag ");
		}
		return SKIP_BODY;
	}
}
