package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009RO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009RO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009RO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009RO_0002353Iterator theIAO_0000009RO_0002353Iterator = (IAO_0000009RO_0002353Iterator)findAncestorWithClass(this, IAO_0000009RO_0002353Iterator.class);
			pageContext.getOut().print(theIAO_0000009RO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

