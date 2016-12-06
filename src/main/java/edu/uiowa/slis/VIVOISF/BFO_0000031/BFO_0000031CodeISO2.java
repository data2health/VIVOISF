package edu.uiowa.slis.VIVOISF.BFO_0000031;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000031CodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000031CodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000031CodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000031CodeISO2Iterator theBFO_0000031 = (BFO_0000031CodeISO2Iterator)findAncestorWithClass(this, BFO_0000031CodeISO2Iterator.class);
			pageContext.getOut().print(theBFO_0000031.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000031 for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000031 for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}
