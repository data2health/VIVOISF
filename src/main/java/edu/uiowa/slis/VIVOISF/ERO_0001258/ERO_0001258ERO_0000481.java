package edu.uiowa.slis.VIVOISF.ERO_0001258;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001258ERO_0000481 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001258ERO_0000481 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001258ERO_0000481.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0001258ERO_0000481Iterator theERO_0001258ERO_0000481Iterator = (ERO_0001258ERO_0000481Iterator)findAncestorWithClass(this, ERO_0001258ERO_0000481Iterator.class);
			pageContext.getOut().print(theERO_0001258ERO_0000481Iterator.getERO_0000481());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001258 for ERO_0000481 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001258 for ERO_0000481 tag ");
		}
		return SKIP_BODY;
	}
}

