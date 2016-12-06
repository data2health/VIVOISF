package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionRelatesIterator thegeographical_regionRelatesIterator = (geographical_regionRelatesIterator)findAncestorWithClass(this, geographical_regionRelatesIterator.class);
			pageContext.getOut().print(thegeographical_regionRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for relates tag ");
		}
		return SKIP_BODY;
	}
}

