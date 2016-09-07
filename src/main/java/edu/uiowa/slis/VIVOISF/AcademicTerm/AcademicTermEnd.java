package edu.uiowa.slis.VIVOISF.AcademicTerm;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicTermEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicTermEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicTermEnd.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicTermEndIterator theAcademicTermEndIterator = (AcademicTermEndIterator)findAncestorWithClass(this, AcademicTermEndIterator.class);
			pageContext.getOut().print(theAcademicTermEndIterator.getEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicTerm for end tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicTerm for end tag ");
		}
		return SKIP_BODY;
	}
}
