package edu.uiowa.slis.VIVOISF.OBI_0100026;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0100026ERO_0000044 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0100026ERO_0000044 currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0100026ERO_0000044.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OBI_0100026ERO_0000044Iterator theOBI_0100026 = (OBI_0100026ERO_0000044Iterator)findAncestorWithClass(this, OBI_0100026ERO_0000044Iterator.class);
			pageContext.getOut().print(theOBI_0100026.getERO_0000044());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0100026 for ERO_0000044 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0100026 for ERO_0000044 tag ");
		}
		return SKIP_BODY;
	}
}

