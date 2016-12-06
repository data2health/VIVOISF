package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupHasURLIterator thespecial_groupHasURLIterator = (special_groupHasURLIterator)findAncestorWithClass(this, special_groupHasURLIterator.class);
			pageContext.getOut().print(thespecial_groupHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for hasURL tag ");
		}
		return SKIP_BODY;
	}
}
