package edu.uiowa.slis.VIVOISF.BFO_0000001;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000001NationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000001NationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000001NationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000001NationalityRUIterator theBFO_0000001 = (BFO_0000001NationalityRUIterator)findAncestorWithClass(this, BFO_0000001NationalityRUIterator.class);
			pageContext.getOut().print(theBFO_0000001.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000001 for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000001 for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

