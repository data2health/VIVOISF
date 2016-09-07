package edu.uiowa.slis.VIVOISF.Credential;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CredentialResearchAreaOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CredentialResearchAreaOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CredentialResearchAreaOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CredentialResearchAreaOfIterator theCredentialResearchAreaOfIterator = (CredentialResearchAreaOfIterator)findAncestorWithClass(this, CredentialResearchAreaOfIterator.class);
			pageContext.getOut().print(theCredentialResearchAreaOfIterator.getResearchAreaOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Credential for researchAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Credential for researchAreaOf tag ");
		}
		return SKIP_BODY;
	}
}
