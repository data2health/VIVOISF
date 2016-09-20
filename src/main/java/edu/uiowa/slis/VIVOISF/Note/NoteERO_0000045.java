package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteERO_0000045Iterator theNote = (NoteERO_0000045Iterator)findAncestorWithClass(this, NoteERO_0000045Iterator.class);
			pageContext.getOut().print(theNote.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

