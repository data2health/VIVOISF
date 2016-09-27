package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationIssuerInverseIterator theStudentOrganizationIssuerInverseIterator = (StudentOrganizationIssuerInverseIterator)findAncestorWithClass(this, StudentOrganizationIssuerInverseIterator.class);
			pageContext.getOut().print(theStudentOrganizationIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for issuer tag ");
		}
		return SKIP_BODY;
	}
}
