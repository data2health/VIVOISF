package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingHasMaxLongitudeIterator theself_governing = (self_governingHasMaxLongitudeIterator)findAncestorWithClass(this, self_governingHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theself_governing.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}
