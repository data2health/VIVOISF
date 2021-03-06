package edu.uiowa.slis.VIVOISF.Explanatory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExplanatoryRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExplanatoryRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(ExplanatoryRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExplanatoryRelatesIterator theExplanatoryRelatesIterator = (ExplanatoryRelatesIterator)findAncestorWithClass(this, ExplanatoryRelatesIterator.class);
			pageContext.getOut().print(theExplanatoryRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing Explanatory for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Explanatory for relates tag ");
		}
		return SKIP_BODY;
	}
}

