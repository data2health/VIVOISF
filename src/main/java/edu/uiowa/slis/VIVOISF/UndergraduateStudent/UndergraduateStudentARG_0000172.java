package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentARG_0000172 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentARG_0000172 currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentARG_0000172.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentARG_0000172Iterator theUndergraduateStudent = (UndergraduateStudentARG_0000172Iterator)findAncestorWithClass(this, UndergraduateStudentARG_0000172Iterator.class);
			pageContext.getOut().print(theUndergraduateStudent.getARG_0000172());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for ARG_0000172 tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for ARG_0000172 tag ");
		}
		return SKIP_BODY;
	}
}
