package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechAsinIterator theSpeech = (SpeechAsinIterator)findAncestorWithClass(this, SpeechAsinIterator.class);
			pageContext.getOut().print(theSpeech.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for asin tag ");
		}
		return SKIP_BODY;
	}
}
