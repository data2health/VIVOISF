package edu.uiowa.slis.VIVOISF.Phase_3;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase_3BFO_0000055Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase_3BFO_0000055Type currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase_3BFO_0000055Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Phase_3BFO_0000055Iterator thePhase_3BFO_0000055Iterator = (Phase_3BFO_0000055Iterator)findAncestorWithClass(this, Phase_3BFO_0000055Iterator.class);
			pageContext.getOut().print(thePhase_3BFO_0000055Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_3 for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_3 for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}
