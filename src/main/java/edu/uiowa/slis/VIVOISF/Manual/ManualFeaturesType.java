package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualFeaturesIterator theManualFeaturesIterator = (ManualFeaturesIterator)findAncestorWithClass(this, ManualFeaturesIterator.class);
			pageContext.getOut().print(theManualFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for features tag ");
		}
		return SKIP_BODY;
	}
}
