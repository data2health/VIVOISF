package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionRO_0001015Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionRO_0001015Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionRO_0001015Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionRO_0001015Iterator thePrimaryPositionRO_0001015Iterator = (PrimaryPositionRO_0001015Iterator)findAncestorWithClass(this, PrimaryPositionRO_0001015Iterator.class);
			pageContext.getOut().print(thePrimaryPositionRO_0001015Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

