package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(MapERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapERO_0000045Iterator theMap = (MapERO_0000045Iterator)findAncestorWithClass(this, MapERO_0000045Iterator.class);
			pageContext.getOut().print(theMap.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}
