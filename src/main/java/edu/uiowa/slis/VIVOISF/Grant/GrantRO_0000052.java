package edu.uiowa.slis.VIVOISF.Grant;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GrantRO_0000052 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GrantRO_0000052 currentInstance = null;
	private static final Log log = LogFactory.getLog(GrantRO_0000052.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GrantRO_0000052Iterator theGrantRO_0000052Iterator = (GrantRO_0000052Iterator)findAncestorWithClass(this, GrantRO_0000052Iterator.class);
			pageContext.getOut().print(theGrantRO_0000052Iterator.getRO_0000052());
		} catch (Exception e) {
			log.error("Can't find enclosing Grant for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Grant for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}
