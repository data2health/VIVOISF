package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefCitesIterator theBriefCitesIterator = (BriefCitesIterator)findAncestorWithClass(this, BriefCitesIterator.class);
			pageContext.getOut().print(theBriefCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for cites tag ");
		}
		return SKIP_BODY;
	}
}
