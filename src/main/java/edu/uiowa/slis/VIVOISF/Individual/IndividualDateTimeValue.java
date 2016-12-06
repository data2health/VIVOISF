package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualDateTimeValueIterator theIndividualDateTimeValueIterator = (IndividualDateTimeValueIterator)findAncestorWithClass(this, IndividualDateTimeValueIterator.class);
			pageContext.getOut().print(theIndividualDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}
