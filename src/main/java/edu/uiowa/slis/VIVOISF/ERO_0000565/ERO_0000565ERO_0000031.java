package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565ERO_0000031 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565ERO_0000031 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565ERO_0000031.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565ERO_0000031Iterator theERO_0000565ERO_0000031Iterator = (ERO_0000565ERO_0000031Iterator)findAncestorWithClass(this, ERO_0000565ERO_0000031Iterator.class);
			pageContext.getOut().print(theERO_0000565ERO_0000031Iterator.getERO_0000031());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}
