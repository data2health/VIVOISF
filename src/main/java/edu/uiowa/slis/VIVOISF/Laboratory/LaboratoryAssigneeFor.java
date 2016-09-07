package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryAssigneeForIterator theLaboratoryAssigneeForIterator = (LaboratoryAssigneeForIterator)findAncestorWithClass(this, LaboratoryAssigneeForIterator.class);
			pageContext.getOut().print(theLaboratoryAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}
