package edu.uiowa.slis.VIVOISF.ARG_2000011;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000011RO_0000057 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000011RO_0000057 currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000011RO_0000057.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000011RO_0000057Iterator theARG_2000011RO_0000057Iterator = (ARG_2000011RO_0000057Iterator)findAncestorWithClass(this, ARG_2000011RO_0000057Iterator.class);
			pageContext.getOut().print(theARG_2000011RO_0000057Iterator.getRO_0000057());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000011 for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000011 for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}
