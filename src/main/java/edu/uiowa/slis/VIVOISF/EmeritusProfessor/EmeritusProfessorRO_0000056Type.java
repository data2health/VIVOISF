package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorRO_0000056Iterator theEmeritusProfessorRO_0000056Iterator = (EmeritusProfessorRO_0000056Iterator)findAncestorWithClass(this, EmeritusProfessorRO_0000056Iterator.class);
			pageContext.getOut().print(theEmeritusProfessorRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}
