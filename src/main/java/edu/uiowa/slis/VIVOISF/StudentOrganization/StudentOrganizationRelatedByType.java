package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationRelatedByIterator theStudentOrganizationRelatedByIterator = (StudentOrganizationRelatedByIterator)findAncestorWithClass(this, StudentOrganizationRelatedByIterator.class);
			pageContext.getOut().print(theStudentOrganizationRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}
