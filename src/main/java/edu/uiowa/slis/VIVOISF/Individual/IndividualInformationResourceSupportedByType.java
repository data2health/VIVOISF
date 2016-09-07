package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualInformationResourceSupportedByIterator theIndividualInformationResourceSupportedByIterator = (IndividualInformationResourceSupportedByIterator)findAncestorWithClass(this, IndividualInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theIndividualInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}
