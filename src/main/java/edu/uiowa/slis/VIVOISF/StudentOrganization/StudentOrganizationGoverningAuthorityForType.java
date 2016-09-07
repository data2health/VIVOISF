package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationGoverningAuthorityForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationGoverningAuthorityForType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationGoverningAuthorityForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationGoverningAuthorityForIterator theStudentOrganizationGoverningAuthorityForIterator = (StudentOrganizationGoverningAuthorityForIterator)findAncestorWithClass(this, StudentOrganizationGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theStudentOrganizationGoverningAuthorityForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}
