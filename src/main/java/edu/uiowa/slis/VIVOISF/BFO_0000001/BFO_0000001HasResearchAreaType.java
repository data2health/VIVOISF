package edu.uiowa.slis.VIVOISF.BFO_0000001;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000001HasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000001HasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000001HasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000001HasResearchAreaIterator theBFO_0000001HasResearchAreaIterator = (BFO_0000001HasResearchAreaIterator)findAncestorWithClass(this, BFO_0000001HasResearchAreaIterator.class);
			pageContext.getOut().print(theBFO_0000001HasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000001 for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000001 for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

