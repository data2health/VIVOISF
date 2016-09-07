package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentDocumentationForIterator theAudioVisualDocumentDocumentationForIterator = (AudioVisualDocumentDocumentationForIterator)findAncestorWithClass(this, AudioVisualDocumentDocumentationForIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}
