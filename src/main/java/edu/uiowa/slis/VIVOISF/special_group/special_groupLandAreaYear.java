package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupLandAreaYearIterator thespecial_group = (special_groupLandAreaYearIterator)findAncestorWithClass(this, special_groupLandAreaYearIterator.class);
			pageContext.getOut().print(thespecial_group.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}
