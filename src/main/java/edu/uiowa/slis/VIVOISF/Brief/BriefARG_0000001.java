package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefARG_0000001Iterator theBrief = (BriefARG_0000001Iterator)findAncestorWithClass(this, BriefARG_0000001Iterator.class);
			pageContext.getOut().print(theBrief.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}
