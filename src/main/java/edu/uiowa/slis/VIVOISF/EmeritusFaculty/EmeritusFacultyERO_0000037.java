package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyERO_0000037 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyERO_0000037 currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyERO_0000037.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyERO_0000037Iterator theEmeritusFacultyERO_0000037Iterator = (EmeritusFacultyERO_0000037Iterator)findAncestorWithClass(this, EmeritusFacultyERO_0000037Iterator.class);
			pageContext.getOut().print(theEmeritusFacultyERO_0000037Iterator.getERO_0000037());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

