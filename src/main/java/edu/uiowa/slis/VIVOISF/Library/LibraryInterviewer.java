package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryInterviewerIterator theLibraryInterviewerIterator = (LibraryInterviewerIterator)findAncestorWithClass(this, LibraryInterviewerIterator.class);
			pageContext.getOut().print(theLibraryInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for interviewer tag ");
		}
		return SKIP_BODY;
	}
}
