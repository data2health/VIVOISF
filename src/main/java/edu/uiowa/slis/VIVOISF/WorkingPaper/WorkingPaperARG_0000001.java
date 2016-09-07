package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperARG_0000001Iterator theWorkingPaper = (WorkingPaperARG_0000001Iterator)findAncestorWithClass(this, WorkingPaperARG_0000001Iterator.class);
			pageContext.getOut().print(theWorkingPaper.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}
