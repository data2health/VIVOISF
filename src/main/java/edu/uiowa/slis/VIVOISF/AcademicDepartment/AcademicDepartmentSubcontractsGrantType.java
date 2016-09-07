package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentSubcontractsGrantType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentSubcontractsGrantType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentSubcontractsGrantType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentSubcontractsGrantIterator theAcademicDepartmentSubcontractsGrantIterator = (AcademicDepartmentSubcontractsGrantIterator)findAncestorWithClass(this, AcademicDepartmentSubcontractsGrantIterator.class);
			pageContext.getOut().print(theAcademicDepartmentSubcontractsGrantIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}
