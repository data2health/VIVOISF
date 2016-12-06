package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(areaHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaHasEmailIterator theareaHasEmailIterator = (areaHasEmailIterator)findAncestorWithClass(this, areaHasEmailIterator.class);
			pageContext.getOut().print(theareaHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing area for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}
