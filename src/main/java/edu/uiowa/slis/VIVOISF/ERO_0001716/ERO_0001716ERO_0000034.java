package edu.uiowa.slis.VIVOISF.ERO_0001716;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001716ERO_0000034 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001716ERO_0000034 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001716ERO_0000034.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0001716ERO_0000034Iterator theERO_0001716ERO_0000034Iterator = (ERO_0001716ERO_0000034Iterator)findAncestorWithClass(this, ERO_0001716ERO_0000034Iterator.class);
			pageContext.getOut().print(theERO_0001716ERO_0000034Iterator.getERO_0000034());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001716 for ERO_0000034 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001716 for ERO_0000034 tag ");
		}
		return SKIP_BODY;
	}
}

