package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameListENIterator theSelf_governing = (Self_governingNameListENIterator)findAncestorWithClass(this, Self_governingNameListENIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

