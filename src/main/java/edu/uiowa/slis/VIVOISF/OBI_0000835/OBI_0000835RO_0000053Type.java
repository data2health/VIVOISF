package edu.uiowa.slis.VIVOISF.OBI_0000835;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000835RO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000835RO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000835RO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000835RO_0000053Iterator theOBI_0000835RO_0000053Iterator = (OBI_0000835RO_0000053Iterator)findAncestorWithClass(this, OBI_0000835RO_0000053Iterator.class);
			pageContext.getOut().print(theOBI_0000835RO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000835 for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000835 for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}
