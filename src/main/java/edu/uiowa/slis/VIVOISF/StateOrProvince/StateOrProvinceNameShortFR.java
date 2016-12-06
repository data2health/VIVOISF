package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameShortFRIterator theStateOrProvince = (StateOrProvinceNameShortFRIterator)findAncestorWithClass(this, StateOrProvinceNameShortFRIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}
