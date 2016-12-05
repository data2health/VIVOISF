package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceOwnerIterator theReferenceSourceOwnerIterator = (ReferenceSourceOwnerIterator)findAncestorWithClass(this, ReferenceSourceOwnerIterator.class);
			pageContext.getOut().print(theReferenceSourceOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for owner tag ");
		}
		return SKIP_BODY;
	}
}
