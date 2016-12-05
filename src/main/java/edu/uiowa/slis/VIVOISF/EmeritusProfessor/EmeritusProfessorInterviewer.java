package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorInterviewerIterator theEmeritusProfessorInterviewerIterator = (EmeritusProfessorInterviewerIterator)findAncestorWithClass(this, EmeritusProfessorInterviewerIterator.class);
			pageContext.getOut().print(theEmeritusProfessorInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for interviewer tag ");
		}
		return SKIP_BODY;
	}
}
