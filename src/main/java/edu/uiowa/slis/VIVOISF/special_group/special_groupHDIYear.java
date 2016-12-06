package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupHDIYearIterator thespecial_group = (special_groupHDIYearIterator)findAncestorWithClass(this, special_groupHDIYearIterator.class);
			pageContext.getOut().print(thespecial_group.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}
