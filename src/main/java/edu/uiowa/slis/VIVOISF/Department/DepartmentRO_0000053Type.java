package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentRO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentRO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentRO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentRO_0000053Iterator theDepartmentRO_0000053Iterator = (DepartmentRO_0000053Iterator)findAncestorWithClass(this, DepartmentRO_0000053Iterator.class);
			pageContext.getOut().print(theDepartmentRO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}
