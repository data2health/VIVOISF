package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorRO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorRO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorRO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorRO_0000053Iterator theEmeritusProfessorRO_0000053Iterator = (EmeritusProfessorRO_0000053Iterator)findAncestorWithClass(this, EmeritusProfessorRO_0000053Iterator.class);
			pageContext.getOut().print(theEmeritusProfessorRO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}
