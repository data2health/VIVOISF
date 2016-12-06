package edu.uiowa.slis.VIVOISF.BFO_0000006;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000006RelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000006RelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000006RelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000006RelatedByIterator theBFO_0000006RelatedByIterator = (BFO_0000006RelatedByIterator)findAncestorWithClass(this, BFO_0000006RelatedByIterator.class);
			pageContext.getOut().print(theBFO_0000006RelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000006 for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000006 for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}
