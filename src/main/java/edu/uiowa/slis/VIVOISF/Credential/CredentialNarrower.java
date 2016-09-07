package edu.uiowa.slis.VIVOISF.Credential;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CredentialNarrower extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CredentialNarrower currentInstance = null;
	private static final Log log = LogFactory.getLog(CredentialNarrower.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CredentialNarrowerIterator theCredentialNarrowerIterator = (CredentialNarrowerIterator)findAncestorWithClass(this, CredentialNarrowerIterator.class);
			pageContext.getOut().print(theCredentialNarrowerIterator.getNarrower());
		} catch (Exception e) {
			log.error("Can't find enclosing Credential for narrower tag ", e);
			throw new JspTagException("Error: Can't find enclosing Credential for narrower tag ");
		}
		return SKIP_BODY;
	}
}
