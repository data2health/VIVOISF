package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Special_groupNameOfficialZHIterator theSpecial_group = (Special_groupNameOfficialZHIterator)findAncestorWithClass(this, Special_groupNameOfficialZHIterator.class);
			pageContext.getOut().print(theSpecial_group.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

