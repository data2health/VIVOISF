package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceValidInInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceValidInInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceValidInInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceValidInInverseIterator theStateOrProvinceValidInInverseIterator = (StateOrProvinceValidInInverseIterator)findAncestorWithClass(this, StateOrProvinceValidInInverseIterator.class);
			pageContext.getOut().print(theStateOrProvinceValidInInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for validIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for validIn tag ");
		}
		return SKIP_BODY;
	}
}

