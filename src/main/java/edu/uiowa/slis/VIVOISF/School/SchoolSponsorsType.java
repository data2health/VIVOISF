package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolSponsorsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolSponsorsType currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolSponsorsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolSponsorsIterator theSchoolSponsorsIterator = (SchoolSponsorsIterator)findAncestorWithClass(this, SchoolSponsorsIterator.class);
			pageContext.getOut().print(theSchoolSponsorsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing School for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for sponsors tag ");
		}
		return SKIP_BODY;
	}
}
