package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionARG_0000001Iterator theLegalDecision = (LegalDecisionARG_0000001Iterator)findAncestorWithClass(this, LegalDecisionARG_0000001Iterator.class);
			pageContext.getOut().print(theLegalDecision.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}
