package edu.uiowa.slis.VIVOISF.ERO_0001259;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001259TheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001259TheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001259TheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0001259TheAbstractIterator theERO_0001259 = (ERO_0001259TheAbstractIterator)findAncestorWithClass(this, ERO_0001259TheAbstractIterator.class);
			pageContext.getOut().print(theERO_0001259.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001259 for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001259 for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}
