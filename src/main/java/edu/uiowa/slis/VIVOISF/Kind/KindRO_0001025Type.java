package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindRO_0001025Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindRO_0001025Type currentInstance = null;
	private static final Log log = LogFactory.getLog(KindRO_0001025Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindRO_0001025Iterator theKindRO_0001025Iterator = (KindRO_0001025Iterator)findAncestorWithClass(this, KindRO_0001025Iterator.class);
			pageContext.getOut().print(theKindRO_0001025Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}
