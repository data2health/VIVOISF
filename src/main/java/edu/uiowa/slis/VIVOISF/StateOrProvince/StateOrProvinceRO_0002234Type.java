package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceRO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceRO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceRO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceRO_0002234Iterator theStateOrProvinceRO_0002234Iterator = (StateOrProvinceRO_0002234Iterator)findAncestorWithClass(this, StateOrProvinceRO_0002234Iterator.class);
			pageContext.getOut().print(theStateOrProvinceRO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}
