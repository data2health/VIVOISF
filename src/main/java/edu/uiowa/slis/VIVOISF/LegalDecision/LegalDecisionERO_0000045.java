package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionERO_0000045Iterator theLegalDecision = (LegalDecisionERO_0000045Iterator)findAncestorWithClass(this, LegalDecisionERO_0000045Iterator.class);
			pageContext.getOut().print(theLegalDecision.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

