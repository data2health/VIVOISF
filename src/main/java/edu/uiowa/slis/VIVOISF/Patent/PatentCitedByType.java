package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentCitedByIterator thePatentCitedByIterator = (PatentCitedByIterator)findAncestorWithClass(this, PatentCitedByIterator.class);
			pageContext.getOut().print(thePatentCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for citedBy tag ");
		}
		return SKIP_BODY;
	}
}
