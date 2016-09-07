package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentReproducedInIterator theAudioDocumentReproducedInIterator = (AudioDocumentReproducedInIterator)findAncestorWithClass(this, AudioDocumentReproducedInIterator.class);
			pageContext.getOut().print(theAudioDocumentReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}
