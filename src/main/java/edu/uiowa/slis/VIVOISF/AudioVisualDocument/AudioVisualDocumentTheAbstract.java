package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentTheAbstractIterator theAudioVisualDocument = (AudioVisualDocumentTheAbstractIterator)findAncestorWithClass(this, AudioVisualDocumentTheAbstractIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

