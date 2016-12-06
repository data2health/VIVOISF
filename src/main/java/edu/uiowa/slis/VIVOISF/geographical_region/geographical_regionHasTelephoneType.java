package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionHasTelephoneIterator thegeographical_regionHasTelephoneIterator = (geographical_regionHasTelephoneIterator)findAncestorWithClass(this, geographical_regionHasTelephoneIterator.class);
			pageContext.getOut().print(thegeographical_regionHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

