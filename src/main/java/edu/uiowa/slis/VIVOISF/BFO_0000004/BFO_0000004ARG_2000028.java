package edu.uiowa.slis.VIVOISF.BFO_0000004;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000004ARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000004ARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000004ARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000004ARG_2000028Iterator theBFO_0000004ARG_2000028Iterator = (BFO_0000004ARG_2000028Iterator)findAncestorWithClass(this, BFO_0000004ARG_2000028Iterator.class);
			pageContext.getOut().print(theBFO_0000004ARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000004 for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000004 for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

