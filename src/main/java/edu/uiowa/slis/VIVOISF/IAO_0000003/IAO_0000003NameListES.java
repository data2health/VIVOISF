package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003NameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003NameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003NameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003NameListESIterator theIAO_0000003 = (IAO_0000003NameListESIterator)findAncestorWithClass(this, IAO_0000003NameListESIterator.class);
			pageContext.getOut().print(theIAO_0000003.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for nameListES tag ");
		}
		return SKIP_BODY;
	}
}
