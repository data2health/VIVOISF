package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryHasEmailIterator theterritoryHasEmailIterator = (territoryHasEmailIterator)findAncestorWithClass(this, territoryHasEmailIterator.class);
			pageContext.getOut().print(theterritoryHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}
