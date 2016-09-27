package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territorySameAsInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territorySameAsInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(territorySameAsInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territorySameAsInverseIterator theterritorySameAsInverseIterator = (territorySameAsInverseIterator)findAncestorWithClass(this, territorySameAsInverseIterator.class);
			pageContext.getOut().print(theterritorySameAsInverseIterator.getSameAsInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for sameAs tag ");
		}
		return SKIP_BODY;
	}
}
