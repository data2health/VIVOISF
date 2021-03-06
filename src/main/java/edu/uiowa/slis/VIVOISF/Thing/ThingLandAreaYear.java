package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingLandAreaYearIterator theThing = (ThingLandAreaYearIterator)findAncestorWithClass(this, ThingLandAreaYearIterator.class);
			pageContext.getOut().print(theThing.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

