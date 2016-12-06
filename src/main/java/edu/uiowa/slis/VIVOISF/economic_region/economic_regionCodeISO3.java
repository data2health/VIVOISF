package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionCodeISO3Iterator theeconomic_region = (economic_regionCodeISO3Iterator)findAncestorWithClass(this, economic_regionCodeISO3Iterator.class);
			pageContext.getOut().print(theeconomic_region.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

