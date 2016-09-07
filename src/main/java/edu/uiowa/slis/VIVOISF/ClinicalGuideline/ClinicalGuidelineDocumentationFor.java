package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineDocumentationForIterator theClinicalGuidelineDocumentationForIterator = (ClinicalGuidelineDocumentationForIterator)findAncestorWithClass(this, ClinicalGuidelineDocumentationForIterator.class);
			pageContext.getOut().print(theClinicalGuidelineDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}
