package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030IAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030IAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030IAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030IAO_0000136Iterator theIAO_0000030IAO_0000136Iterator = (IAO_0000030IAO_0000136Iterator)findAncestorWithClass(this, IAO_0000030IAO_0000136Iterator.class);
			pageContext.getOut().print(theIAO_0000030IAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}
