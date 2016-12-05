package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingBottomObjectProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingBottomObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingBottomObjectProperty.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingBottomObjectPropertyIterator theThingBottomObjectPropertyIterator = (ThingBottomObjectPropertyIterator)findAncestorWithClass(this, ThingBottomObjectPropertyIterator.class);
			pageContext.getOut().print(theThingBottomObjectPropertyIterator.getBottomObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}
