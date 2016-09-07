package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentERO_0000033 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentERO_0000033 currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentERO_0000033.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentERO_0000033Iterator theStudentERO_0000033Iterator = (StudentERO_0000033Iterator)findAncestorWithClass(this, StudentERO_0000033Iterator.class);
			pageContext.getOut().print(theStudentERO_0000033Iterator.getERO_0000033());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for ERO_0000033 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for ERO_0000033 tag ");
		}
		return SKIP_BODY;
	}
}
