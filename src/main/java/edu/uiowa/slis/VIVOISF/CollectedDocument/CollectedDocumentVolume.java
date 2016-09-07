package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentVolumeIterator theCollectedDocument = (CollectedDocumentVolumeIterator)findAncestorWithClass(this, CollectedDocumentVolumeIterator.class);
			pageContext.getOut().print(theCollectedDocument.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for volume tag ");
		}
		return SKIP_BODY;
	}
}
