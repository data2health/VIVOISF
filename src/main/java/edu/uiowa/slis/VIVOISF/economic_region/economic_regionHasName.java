package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionHasNameIterator theeconomic_regionHasNameIterator = (economic_regionHasNameIterator)findAncestorWithClass(this, economic_regionHasNameIterator.class);
			pageContext.getOut().print(theeconomic_regionHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for hasName tag ");
		}
		return SKIP_BODY;
	}
}

