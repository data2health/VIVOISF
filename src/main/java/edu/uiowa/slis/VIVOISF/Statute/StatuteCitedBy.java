package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteCitedByIterator theStatuteCitedByIterator = (StatuteCitedByIterator)findAncestorWithClass(this, StatuteCitedByIterator.class);
			pageContext.getOut().print(theStatuteCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for citedBy tag ");
		}
		return SKIP_BODY;
	}
}
