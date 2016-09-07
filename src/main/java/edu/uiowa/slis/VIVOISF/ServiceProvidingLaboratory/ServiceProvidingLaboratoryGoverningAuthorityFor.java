package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryGoverningAuthorityFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryGoverningAuthorityFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryGoverningAuthorityFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryGoverningAuthorityForIterator theServiceProvidingLaboratoryGoverningAuthorityForIterator = (ServiceProvidingLaboratoryGoverningAuthorityForIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryGoverningAuthorityForIterator.getGoverningAuthorityFor());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}
