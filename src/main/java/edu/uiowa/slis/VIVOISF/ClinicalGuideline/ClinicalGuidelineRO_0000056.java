package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineRO_0000056Iterator theClinicalGuidelineRO_0000056Iterator = (ClinicalGuidelineRO_0000056Iterator)findAncestorWithClass(this, ClinicalGuidelineRO_0000056Iterator.class);
			pageContext.getOut().print(theClinicalGuidelineRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}
