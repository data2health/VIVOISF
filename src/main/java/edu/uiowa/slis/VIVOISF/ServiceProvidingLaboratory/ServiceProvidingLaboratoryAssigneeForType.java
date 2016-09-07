package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryAssigneeForIterator theServiceProvidingLaboratoryAssigneeForIterator = (ServiceProvidingLaboratoryAssigneeForIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryAssigneeForIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}
