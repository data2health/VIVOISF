package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupInformationResourceSupportedByIterator theGroupInformationResourceSupportedByIterator = (GroupInformationResourceSupportedByIterator)findAncestorWithClass(this, GroupInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theGroupInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}
