package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyHasTranslationIterator theCaseStudyHasTranslationIterator = (CaseStudyHasTranslationIterator)findAncestorWithClass(this, CaseStudyHasTranslationIterator.class);
			pageContext.getOut().print(theCaseStudyHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}
