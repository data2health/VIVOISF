package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009BFO_0000051Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009BFO_0000051Type currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009BFO_0000051Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009BFO_0000051Iterator theIAO_0000009BFO_0000051Iterator = (IAO_0000009BFO_0000051Iterator)findAncestorWithClass(this, IAO_0000009BFO_0000051Iterator.class);
			pageContext.getOut().print(theIAO_0000009BFO_0000051Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}
