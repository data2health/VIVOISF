package edu.uiowa.slis.VIVOISF.Campus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CampusRO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CampusRO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CampusRO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CampusRO_0000053Iterator theCampusRO_0000053Iterator = (CampusRO_0000053Iterator)findAncestorWithClass(this, CampusRO_0000053Iterator.class);
			pageContext.getOut().print(theCampusRO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Campus for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Campus for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}
