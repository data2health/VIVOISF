package edu.uiowa.slis.VIVOISF.ERO_0000014;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000014RO_0000057Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000014RO_0000057Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000014RO_0000057Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000014RO_0000057Iterator theERO_0000014RO_0000057Iterator = (ERO_0000014RO_0000057Iterator)findAncestorWithClass(this, ERO_0000014RO_0000057Iterator.class);
			pageContext.getOut().print(theERO_0000014RO_0000057Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000014 for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000014 for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}
