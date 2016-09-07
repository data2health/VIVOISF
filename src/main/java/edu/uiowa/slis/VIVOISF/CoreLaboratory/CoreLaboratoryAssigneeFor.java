package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryAssigneeForIterator theCoreLaboratoryAssigneeForIterator = (CoreLaboratoryAssigneeForIterator)findAncestorWithClass(this, CoreLaboratoryAssigneeForIterator.class);
			pageContext.getOut().print(theCoreLaboratoryAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}
