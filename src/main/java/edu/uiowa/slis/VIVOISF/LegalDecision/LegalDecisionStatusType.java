package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionStatusIterator theLegalDecisionStatusIterator = (LegalDecisionStatusIterator)findAncestorWithClass(this, LegalDecisionStatusIterator.class);
			pageContext.getOut().print(theLegalDecisionStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for status tag ");
		}
		return SKIP_BODY;
	}
}
