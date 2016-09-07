package edu.uiowa.slis.VIVOISF.Facility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacilityRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacilityRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(FacilityRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacilityRO_0000056Iterator theFacilityRO_0000056Iterator = (FacilityRO_0000056Iterator)findAncestorWithClass(this, FacilityRO_0000056Iterator.class);
			pageContext.getOut().print(theFacilityRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Facility for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Facility for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}
