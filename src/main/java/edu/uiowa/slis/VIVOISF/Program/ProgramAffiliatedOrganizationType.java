package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramAffiliatedOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramAffiliatedOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramAffiliatedOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramAffiliatedOrganizationIterator theProgramAffiliatedOrganizationIterator = (ProgramAffiliatedOrganizationIterator)findAncestorWithClass(this, ProgramAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theProgramAffiliatedOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}
