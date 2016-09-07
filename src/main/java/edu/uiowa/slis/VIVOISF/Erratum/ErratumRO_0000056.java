package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumRO_0000056Iterator theErratumRO_0000056Iterator = (ErratumRO_0000056Iterator)findAncestorWithClass(this, ErratumRO_0000056Iterator.class);
			pageContext.getOut().print(theErratumRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}
