package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003BFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003BFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003BFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003BFO_0000051Iterator theIAO_0000003BFO_0000051Iterator = (IAO_0000003BFO_0000051Iterator)findAncestorWithClass(this, IAO_0000003BFO_0000051Iterator.class);
			pageContext.getOut().print(theIAO_0000003BFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}
