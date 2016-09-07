package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionRO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionRO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionRO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionRO_0000053Iterator theDivisionRO_0000053Iterator = (DivisionRO_0000053Iterator)findAncestorWithClass(this, DivisionRO_0000053Iterator.class);
			pageContext.getOut().print(theDivisionRO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}
