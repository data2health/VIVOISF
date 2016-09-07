package edu.uiowa.slis.VIVOISF.ERO_0001257;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001257Doi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001257Doi currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001257Doi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0001257DoiIterator theERO_0001257 = (ERO_0001257DoiIterator)findAncestorWithClass(this, ERO_0001257DoiIterator.class);
			pageContext.getOut().print(theERO_0001257.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001257 for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001257 for doi tag ");
		}
		return SKIP_BODY;
	}
}
