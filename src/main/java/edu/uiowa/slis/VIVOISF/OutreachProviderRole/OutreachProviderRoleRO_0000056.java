package edu.uiowa.slis.VIVOISF.OutreachProviderRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OutreachProviderRoleRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OutreachProviderRoleRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(OutreachProviderRoleRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OutreachProviderRoleRO_0000056Iterator theOutreachProviderRoleRO_0000056Iterator = (OutreachProviderRoleRO_0000056Iterator)findAncestorWithClass(this, OutreachProviderRoleRO_0000056Iterator.class);
			pageContext.getOut().print(theOutreachProviderRoleRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing OutreachProviderRole for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OutreachProviderRole for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}
