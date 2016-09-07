package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualIAO_0000136Iterator theManualIAO_0000136Iterator = (ManualIAO_0000136Iterator)findAncestorWithClass(this, ManualIAO_0000136Iterator.class);
			pageContext.getOut().print(theManualIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}
