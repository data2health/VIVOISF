package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisReproducedInIterator theThesisReproducedInIterator = (ThesisReproducedInIterator)findAncestorWithClass(this, ThesisReproducedInIterator.class);
			pageContext.getOut().print(theThesisReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}
