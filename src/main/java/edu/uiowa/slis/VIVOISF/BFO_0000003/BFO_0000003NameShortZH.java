package edu.uiowa.slis.VIVOISF.BFO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000003NameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000003NameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000003NameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000003NameShortZHIterator theBFO_0000003 = (BFO_0000003NameShortZHIterator)findAncestorWithClass(this, BFO_0000003NameShortZHIterator.class);
			pageContext.getOut().print(theBFO_0000003.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000003 for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000003 for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}
