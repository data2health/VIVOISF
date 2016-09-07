package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CodeARG_2000028Iterator theCodeARG_2000028Iterator = (CodeARG_2000028Iterator)findAncestorWithClass(this, CodeARG_2000028Iterator.class);
			pageContext.getOut().print(theCodeARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}
