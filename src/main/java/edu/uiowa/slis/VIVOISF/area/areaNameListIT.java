package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameListITIterator thearea = (areaNameListITIterator)findAncestorWithClass(this, areaNameListITIterator.class);
			pageContext.getOut().print(thearea.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}
