package edu.uiowa.slis.VIVOISF.BFO_0000020;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000020RO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000020RO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000020RO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000020RO_0000056Iterator theBFO_0000020RO_0000056Iterator = (BFO_0000020RO_0000056Iterator)findAncestorWithClass(this, BFO_0000020RO_0000056Iterator.class);
			pageContext.getOut().print(theBFO_0000020RO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000020 for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000020 for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}
