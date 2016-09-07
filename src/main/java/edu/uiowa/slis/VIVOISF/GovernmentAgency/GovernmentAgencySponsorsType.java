package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencySponsorsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencySponsorsType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencySponsorsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencySponsorsIterator theGovernmentAgencySponsorsIterator = (GovernmentAgencySponsorsIterator)findAncestorWithClass(this, GovernmentAgencySponsorsIterator.class);
			pageContext.getOut().print(theGovernmentAgencySponsorsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for sponsors tag ");
		}
		return SKIP_BODY;
	}
}
