package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(groupHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupHasAddressIterator thegroupHasAddressIterator = (groupHasAddressIterator)findAncestorWithClass(this, groupHasAddressIterator.class);
			pageContext.getOut().print(thegroupHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing group for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}
