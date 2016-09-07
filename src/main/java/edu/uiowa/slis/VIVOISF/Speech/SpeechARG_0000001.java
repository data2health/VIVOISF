package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SpeechARG_0000001Iterator theSpeech = (SpeechARG_0000001Iterator)findAncestorWithClass(this, SpeechARG_0000001Iterator.class);
			pageContext.getOut().print(theSpeech.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}
