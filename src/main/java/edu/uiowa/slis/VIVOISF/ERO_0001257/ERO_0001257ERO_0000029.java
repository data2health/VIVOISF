package edu.uiowa.slis.VIVOISF.ERO_0001257;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001257ERO_0000029 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001257ERO_0000029 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001257ERO_0000029.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0001257ERO_0000029Iterator theERO_0001257ERO_0000029Iterator = (ERO_0001257ERO_0000029Iterator)findAncestorWithClass(this, ERO_0001257ERO_0000029Iterator.class);
			pageContext.getOut().print(theERO_0001257ERO_0000029Iterator.getERO_0000029());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001257 for ERO_0000029 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001257 for ERO_0000029 tag ");
		}
		return SKIP_BODY;
	}
}
