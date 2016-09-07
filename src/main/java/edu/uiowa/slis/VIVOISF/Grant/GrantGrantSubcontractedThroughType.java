package edu.uiowa.slis.VIVOISF.Grant;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GrantGrantSubcontractedThroughType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GrantGrantSubcontractedThroughType currentInstance = null;
	private static final Log log = LogFactory.getLog(GrantGrantSubcontractedThroughType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GrantGrantSubcontractedThroughIterator theGrantGrantSubcontractedThroughIterator = (GrantGrantSubcontractedThroughIterator)findAncestorWithClass(this, GrantGrantSubcontractedThroughIterator.class);
			pageContext.getOut().print(theGrantGrantSubcontractedThroughIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Grant for grantSubcontractedThrough tag ", e);
			throw new JspTagException("Error: Can't find enclosing Grant for grantSubcontractedThrough tag ");
		}
		return SKIP_BODY;
	}
}
