package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteRO_0000056Iterator theStatuteRO_0000056Iterator = (StatuteRO_0000056Iterator)findAncestorWithClass(this, StatuteRO_0000056Iterator.class);
			pageContext.getOut().print(theStatuteRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}
