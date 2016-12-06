package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyPopulationTotalIterator theGovernmentAgency = (GovernmentAgencyPopulationTotalIterator)findAncestorWithClass(this, GovernmentAgencyPopulationTotalIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}
