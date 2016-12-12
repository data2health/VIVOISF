package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaSourceCreator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaSourceCreator currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaSourceCreator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaSourceCreatorIterator theArea = (AreaSourceCreatorIterator)findAncestorWithClass(this, AreaSourceCreatorIterator.class);
			pageContext.getOut().print(theArea.getSourceCreator());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for sourceCreator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for sourceCreator tag ");
		}
		return SKIP_BODY;
	}
}

