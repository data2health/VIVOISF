package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionIsSuccessorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionIsSuccessorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionIsSuccessorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionIsSuccessorOfIterator thegeographical_regionIsSuccessorOfIterator = (geographical_regionIsSuccessorOfIterator)findAncestorWithClass(this, geographical_regionIsSuccessorOfIterator.class);
			pageContext.getOut().print(thegeographical_regionIsSuccessorOfIterator.getIsSuccessorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for isSuccessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for isSuccessorOf tag ");
		}
		return SKIP_BODY;
	}
}
