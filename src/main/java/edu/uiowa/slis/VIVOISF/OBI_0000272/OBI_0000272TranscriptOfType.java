package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272TranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272TranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272TranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272TranscriptOfIterator theOBI_0000272TranscriptOfIterator = (OBI_0000272TranscriptOfIterator)findAncestorWithClass(this, OBI_0000272TranscriptOfIterator.class);
			pageContext.getOut().print(theOBI_0000272TranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}
