package edu.uiowa.slis.VIVOISF.ERO_0001257;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001257IAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001257IAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001257IAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0001257IAO_0000136Iterator theERO_0001257IAO_0000136Iterator = (ERO_0001257IAO_0000136Iterator)findAncestorWithClass(this, ERO_0001257IAO_0000136Iterator.class);
			pageContext.getOut().print(theERO_0001257IAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001257 for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001257 for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}
