package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationARG_2000028Iterator theLocationARG_2000028Iterator = (LocationARG_2000028Iterator)findAncestorWithClass(this, LocationARG_2000028Iterator.class);
			pageContext.getOut().print(theLocationARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}
