package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceHDIYearIterator theStateOrProvince = (StateOrProvinceHDIYearIterator)findAncestorWithClass(this, StateOrProvinceHDIYearIterator.class);
			pageContext.getOut().print(theStateOrProvince.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}
