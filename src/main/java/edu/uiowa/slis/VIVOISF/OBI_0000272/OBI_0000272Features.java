package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272Features extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272Features currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272Features.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272FeaturesIterator theOBI_0000272FeaturesIterator = (OBI_0000272FeaturesIterator)findAncestorWithClass(this, OBI_0000272FeaturesIterator.class);
			pageContext.getOut().print(theOBI_0000272FeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for features tag ");
		}
		return SKIP_BODY;
	}
}
