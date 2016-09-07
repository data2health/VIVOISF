package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryHasEquipment extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryHasEquipment currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryHasEquipment.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryHasEquipmentIterator theServiceProvidingLaboratoryHasEquipmentIterator = (ServiceProvidingLaboratoryHasEquipmentIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryHasEquipmentIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryHasEquipmentIterator.getHasEquipment());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}
