package edu.uiowa.slis.VIVOISF.BFO_0000031;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000031HasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000031HasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000031HasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000031HasSubjectAreaIterator theBFO_0000031HasSubjectAreaIterator = (BFO_0000031HasSubjectAreaIterator)findAncestorWithClass(this, BFO_0000031HasSubjectAreaIterator.class);
			pageContext.getOut().print(theBFO_0000031HasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000031 for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000031 for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

