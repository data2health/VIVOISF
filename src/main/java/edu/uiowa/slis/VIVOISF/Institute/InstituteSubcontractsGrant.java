package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteSubcontractsGrant extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteSubcontractsGrant currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteSubcontractsGrant.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteSubcontractsGrantIterator theInstituteSubcontractsGrantIterator = (InstituteSubcontractsGrantIterator)findAncestorWithClass(this, InstituteSubcontractsGrantIterator.class);
			pageContext.getOut().print(theInstituteSubcontractsGrantIterator.getSubcontractsGrant());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}
