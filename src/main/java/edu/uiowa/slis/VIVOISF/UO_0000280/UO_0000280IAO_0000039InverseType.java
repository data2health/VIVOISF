package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280IAO_0000039InverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280IAO_0000039InverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280IAO_0000039InverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UO_0000280IAO_0000039InverseIterator theUO_0000280IAO_0000039InverseIterator = (UO_0000280IAO_0000039InverseIterator)findAncestorWithClass(this, UO_0000280IAO_0000039InverseIterator.class);
			pageContext.getOut().print(theUO_0000280IAO_0000039InverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for IAO_0000039 tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for IAO_0000039 tag ");
		}
		return SKIP_BODY;
	}
}
