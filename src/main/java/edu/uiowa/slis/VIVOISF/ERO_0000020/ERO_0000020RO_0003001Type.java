package edu.uiowa.slis.VIVOISF.ERO_0000020;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000020RO_0003001Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000020RO_0003001Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000020RO_0003001Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000020RO_0003001Iterator theERO_0000020RO_0003001Iterator = (ERO_0000020RO_0003001Iterator)findAncestorWithClass(this, ERO_0000020RO_0003001Iterator.class);
			pageContext.getOut().print(theERO_0000020RO_0003001Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000020 for RO_0003001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000020 for RO_0003001 tag ");
		}
		return SKIP_BODY;
	}
}
