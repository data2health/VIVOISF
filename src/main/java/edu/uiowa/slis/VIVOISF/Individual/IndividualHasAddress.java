package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualHasAddressIterator theIndividualHasAddressIterator = (IndividualHasAddressIterator)findAncestorWithClass(this, IndividualHasAddressIterator.class);
			pageContext.getOut().print(theIndividualHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}
