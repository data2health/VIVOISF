package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramDirectorInverseIterator theProgramDirectorInverseIterator = (ProgramDirectorInverseIterator)findAncestorWithClass(this, ProgramDirectorInverseIterator.class);
			pageContext.getOut().print(theProgramDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for director tag ");
		}
		return SKIP_BODY;
	}
}
