package edu.uiowa.slis.VIVOISF.ERO_0001260;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001260ERO_0000390Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001260ERO_0000390Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001260ERO_0000390Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0001260ERO_0000390Iterator theERO_0001260ERO_0000390Iterator = (ERO_0001260ERO_0000390Iterator)findAncestorWithClass(this, ERO_0001260ERO_0000390Iterator.class);
			pageContext.getOut().print(theERO_0001260ERO_0000390Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001260 for ERO_0000390 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001260 for ERO_0000390 tag ");
		}
		return SKIP_BODY;
	}
}
