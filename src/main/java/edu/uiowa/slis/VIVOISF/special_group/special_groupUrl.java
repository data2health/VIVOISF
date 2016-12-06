package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupUrlIterator thespecial_group = (special_groupUrlIterator)findAncestorWithClass(this, special_groupUrlIterator.class);
			pageContext.getOut().print(thespecial_group.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for url tag ");
		}
		return SKIP_BODY;
	}
}
