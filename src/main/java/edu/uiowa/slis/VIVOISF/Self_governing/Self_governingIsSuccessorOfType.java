package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingIsSuccessorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingIsSuccessorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingIsSuccessorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Self_governingIsSuccessorOfIterator theSelf_governingIsSuccessorOfIterator = (Self_governingIsSuccessorOfIterator)findAncestorWithClass(this, Self_governingIsSuccessorOfIterator.class);
			pageContext.getOut().print(theSelf_governingIsSuccessorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for isSuccessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for isSuccessorOf tag ");
		}
		return SKIP_BODY;
	}
}

