package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingValidInInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingValidInInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingValidInInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingValidInInverseIterator theself_governingValidInInverseIterator = (self_governingValidInInverseIterator)findAncestorWithClass(this, self_governingValidInInverseIterator.class);
			pageContext.getOut().print(theself_governingValidInInverseIterator.getValidInInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for validIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for validIn tag ");
		}
		return SKIP_BODY;
	}
}

