package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DepartmentRelatedByIterator theDepartmentRelatedByIterator = (DepartmentRelatedByIterator)findAncestorWithClass(this, DepartmentRelatedByIterator.class);
			pageContext.getOut().print(theDepartmentRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Department for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}
