package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualHasTranslationIterator theManualHasTranslationIterator = (ManualHasTranslationIterator)findAncestorWithClass(this, ManualHasTranslationIterator.class);
			pageContext.getOut().print(theManualHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}
