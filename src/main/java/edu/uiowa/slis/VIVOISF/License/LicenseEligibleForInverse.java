package edu.uiowa.slis.VIVOISF.License;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LicenseEligibleForInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LicenseEligibleForInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LicenseEligibleForInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LicenseEligibleForInverseIterator theLicenseEligibleForInverseIterator = (LicenseEligibleForInverseIterator)findAncestorWithClass(this, LicenseEligibleForInverseIterator.class);
			pageContext.getOut().print(theLicenseEligibleForInverseIterator.getEligibleForInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing License for eligibleFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing License for eligibleFor tag ");
		}
		return SKIP_BODY;
	}
}

