package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyRelatedByIterator theEmeritusFacultyRelatedByIterator = (EmeritusFacultyRelatedByIterator)findAncestorWithClass(this, EmeritusFacultyRelatedByIterator.class);
			pageContext.getOut().print(theEmeritusFacultyRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}
