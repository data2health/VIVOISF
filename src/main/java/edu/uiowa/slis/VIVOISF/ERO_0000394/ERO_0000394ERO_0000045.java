package edu.uiowa.slis.VIVOISF.ERO_0000394;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000394ERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000394ERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000394ERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0000394ERO_0000045Iterator theERO_0000394 = (ERO_0000394ERO_0000045Iterator)findAncestorWithClass(this, ERO_0000394ERO_0000045Iterator.class);
			pageContext.getOut().print(theERO_0000394.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000394 for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000394 for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

