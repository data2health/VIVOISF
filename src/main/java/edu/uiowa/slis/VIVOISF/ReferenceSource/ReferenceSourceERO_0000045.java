package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceERO_0000045Iterator theReferenceSource = (ReferenceSourceERO_0000045Iterator)findAncestorWithClass(this, ReferenceSourceERO_0000045Iterator.class);
			pageContext.getOut().print(theReferenceSource.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

