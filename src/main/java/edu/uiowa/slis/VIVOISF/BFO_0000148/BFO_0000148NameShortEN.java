package edu.uiowa.slis.VIVOISF.BFO_0000148;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000148NameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000148NameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000148NameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000148NameShortENIterator theBFO_0000148 = (BFO_0000148NameShortENIterator)findAncestorWithClass(this, BFO_0000148NameShortENIterator.class);
			pageContext.getOut().print(theBFO_0000148.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000148 for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000148 for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}
