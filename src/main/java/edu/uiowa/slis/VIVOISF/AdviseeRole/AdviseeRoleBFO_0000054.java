package edu.uiowa.slis.VIVOISF.AdviseeRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdviseeRoleBFO_0000054 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdviseeRoleBFO_0000054 currentInstance = null;
	private static final Log log = LogFactory.getLog(AdviseeRoleBFO_0000054.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AdviseeRoleBFO_0000054Iterator theAdviseeRoleBFO_0000054Iterator = (AdviseeRoleBFO_0000054Iterator)findAncestorWithClass(this, AdviseeRoleBFO_0000054Iterator.class);
			pageContext.getOut().print(theAdviseeRoleBFO_0000054Iterator.getBFO_0000054());
		} catch (Exception e) {
			log.error("Can't find enclosing AdviseeRole for BFO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdviseeRole for BFO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}
