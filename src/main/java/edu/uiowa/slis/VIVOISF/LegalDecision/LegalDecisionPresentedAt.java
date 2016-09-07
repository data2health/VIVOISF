package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionPresentedAtIterator theLegalDecisionPresentedAtIterator = (LegalDecisionPresentedAtIterator)findAncestorWithClass(this, LegalDecisionPresentedAtIterator.class);
			pageContext.getOut().print(theLegalDecisionPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}
