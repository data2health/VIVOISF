package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteCourtInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteCourtInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteCourtInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteCourtInverseIterator theInstituteCourtInverseIterator = (InstituteCourtInverseIterator)findAncestorWithClass(this, InstituteCourtInverseIterator.class);
			pageContext.getOut().print(theInstituteCourtInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for court tag ");
		}
		return SKIP_BODY;
	}
}
