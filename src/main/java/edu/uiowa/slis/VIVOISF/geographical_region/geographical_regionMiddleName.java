package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionMiddleName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionMiddleName currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionMiddleName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionMiddleNameIterator thegeographical_region = (geographical_regionMiddleNameIterator)findAncestorWithClass(this, geographical_regionMiddleNameIterator.class);
			pageContext.getOut().print(thegeographical_region.getMiddleName());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for middleName tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for middleName tag ");
		}
		return SKIP_BODY;
	}
}

