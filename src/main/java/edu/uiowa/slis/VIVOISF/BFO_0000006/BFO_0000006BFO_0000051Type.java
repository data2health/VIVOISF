package edu.uiowa.slis.VIVOISF.BFO_0000006;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000006BFO_0000051Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000006BFO_0000051Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000006BFO_0000051Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000006BFO_0000051Iterator theBFO_0000006BFO_0000051Iterator = (BFO_0000006BFO_0000051Iterator)findAncestorWithClass(this, BFO_0000006BFO_0000051Iterator.class);
			pageContext.getOut().print(theBFO_0000006BFO_0000051Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000006 for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000006 for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

