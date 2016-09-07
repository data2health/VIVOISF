package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationHasSuccessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationHasSuccessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationHasSuccessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationHasSuccessorOrganizationIterator theAssociationHasSuccessorOrganizationIterator = (AssociationHasSuccessorOrganizationIterator)findAncestorWithClass(this, AssociationHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theAssociationHasSuccessorOrganizationIterator.getHasSuccessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}
