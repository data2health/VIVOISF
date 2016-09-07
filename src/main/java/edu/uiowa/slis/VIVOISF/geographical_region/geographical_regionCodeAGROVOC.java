package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionCodeAGROVOCIterator thegeographical_region = (geographical_regionCodeAGROVOCIterator)findAncestorWithClass(this, geographical_regionCodeAGROVOCIterator.class);
			pageContext.getOut().print(thegeographical_region.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}
