package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionTranslationOfIterator theLegalDecisionTranslationOfIterator = (LegalDecisionTranslationOfIterator)findAncestorWithClass(this, LegalDecisionTranslationOfIterator.class);
			pageContext.getOut().print(theLegalDecisionTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for translationOf tag ");
		}
		return SKIP_BODY;
	}
}
