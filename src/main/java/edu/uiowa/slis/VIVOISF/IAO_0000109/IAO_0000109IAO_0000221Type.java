package edu.uiowa.slis.VIVOISF.IAO_0000109;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000109IAO_0000221Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000109IAO_0000221Type currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000109IAO_0000221Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000109IAO_0000221Iterator theIAO_0000109IAO_0000221Iterator = (IAO_0000109IAO_0000221Iterator)findAncestorWithClass(this, IAO_0000109IAO_0000221Iterator.class);
			pageContext.getOut().print(theIAO_0000109IAO_0000221Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000109 for IAO_0000221 tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000109 for IAO_0000221 tag ");
		}
		return SKIP_BODY;
	}
}
