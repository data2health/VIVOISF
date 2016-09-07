package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualReproducesIterator theManualReproducesIterator = (ManualReproducesIterator)findAncestorWithClass(this, ManualReproducesIterator.class);
			pageContext.getOut().print(theManualReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for reproduces tag ");
		}
		return SKIP_BODY;
	}
}
