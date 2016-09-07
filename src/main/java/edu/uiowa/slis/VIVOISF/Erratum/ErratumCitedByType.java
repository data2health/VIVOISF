package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumCitedByIterator theErratumCitedByIterator = (ErratumCitedByIterator)findAncestorWithClass(this, ErratumCitedByIterator.class);
			pageContext.getOut().print(theErratumCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for citedBy tag ");
		}
		return SKIP_BODY;
	}
}
