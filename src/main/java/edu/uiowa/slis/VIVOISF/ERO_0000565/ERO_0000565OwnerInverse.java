package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565OwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565OwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565OwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565OwnerInverseIterator theERO_0000565OwnerInverseIterator = (ERO_0000565OwnerInverseIterator)findAncestorWithClass(this, ERO_0000565OwnerInverseIterator.class);
			pageContext.getOut().print(theERO_0000565OwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for owner tag ");
		}
		return SKIP_BODY;
	}
}
