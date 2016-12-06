package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyHasAddressIterator theGovernmentAgencyHasAddressIterator = (GovernmentAgencyHasAddressIterator)findAncestorWithClass(this, GovernmentAgencyHasAddressIterator.class);
			pageContext.getOut().print(theGovernmentAgencyHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}
