package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameListZHIterator theeconomic_region = (economic_regionNameListZHIterator)findAncestorWithClass(this, economic_regionNameListZHIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

