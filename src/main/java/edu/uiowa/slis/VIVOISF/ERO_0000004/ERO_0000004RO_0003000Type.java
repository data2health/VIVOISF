package edu.uiowa.slis.VIVOISF.ERO_0000004;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000004RO_0003000Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000004RO_0003000Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000004RO_0003000Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000004RO_0003000Iterator theERO_0000004RO_0003000Iterator = (ERO_0000004RO_0003000Iterator)findAncestorWithClass(this, ERO_0000004RO_0003000Iterator.class);
			pageContext.getOut().print(theERO_0000004RO_0003000Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000004 for RO_0003000 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000004 for RO_0003000 tag ");
		}
		return SKIP_BODY;
	}
}
