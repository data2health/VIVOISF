package edu.uiowa.slis.VIVOISF.AdviseeRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdviseeRoleRO_0000052Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdviseeRoleRO_0000052Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AdviseeRoleRO_0000052Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AdviseeRoleRO_0000052Iterator theAdviseeRoleRO_0000052Iterator = (AdviseeRoleRO_0000052Iterator)findAncestorWithClass(this, AdviseeRoleRO_0000052Iterator.class);
			pageContext.getOut().print(theAdviseeRoleRO_0000052Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AdviseeRole for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdviseeRole for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}
