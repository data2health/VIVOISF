package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperFeaturesIterator theConferencePaperFeaturesIterator = (ConferencePaperFeaturesIterator)findAncestorWithClass(this, ConferencePaperFeaturesIterator.class);
			pageContext.getOut().print(theConferencePaperFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for features tag ");
		}
		return SKIP_BODY;
	}
}
