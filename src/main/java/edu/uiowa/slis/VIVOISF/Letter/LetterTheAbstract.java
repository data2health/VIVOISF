package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterTheAbstractIterator theLetter = (LetterTheAbstractIterator)findAncestorWithClass(this, LetterTheAbstractIterator.class);
			pageContext.getOut().print(theLetter.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}
