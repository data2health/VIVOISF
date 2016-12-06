package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionSourceCreator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionSourceCreator currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionSourceCreator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionSourceCreatorIterator thegeographical_region = (geographical_regionSourceCreatorIterator)findAncestorWithClass(this, geographical_regionSourceCreatorIterator.class);
			pageContext.getOut().print(thegeographical_region.getSourceCreator());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for sourceCreator tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for sourceCreator tag ");
		}
		return SKIP_BODY;
	}
}
