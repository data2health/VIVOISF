package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameOfficialZHIterator theSelf_governing = (Self_governingNameOfficialZHIterator)findAncestorWithClass(this, Self_governingNameOfficialZHIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

