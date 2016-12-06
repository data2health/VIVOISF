package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionHasSubjectAreaIterator thegeographical_regionHasSubjectAreaIterator = (geographical_regionHasSubjectAreaIterator)findAncestorWithClass(this, geographical_regionHasSubjectAreaIterator.class);
			pageContext.getOut().print(thegeographical_regionHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}
