package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteOBI_0000304Inverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteOBI_0000304Inverse currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteOBI_0000304Inverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteOBI_0000304InverseIterator theInstituteOBI_0000304InverseIterator = (InstituteOBI_0000304InverseIterator)findAncestorWithClass(this, InstituteOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theInstituteOBI_0000304InverseIterator.getOBI_0000304Inverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}
