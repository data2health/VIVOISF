package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionRO_0000052 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionRO_0000052 currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionRO_0000052.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionRO_0000052Iterator thePrimaryPositionRO_0000052Iterator = (PrimaryPositionRO_0000052Iterator)findAncestorWithClass(this, PrimaryPositionRO_0000052Iterator.class);
			pageContext.getOut().print(thePrimaryPositionRO_0000052Iterator.getRO_0000052());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}
