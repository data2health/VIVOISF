package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(MapARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapARG_0000001Iterator theMap = (MapARG_0000001Iterator)findAncestorWithClass(this, MapARG_0000001Iterator.class);
			pageContext.getOut().print(theMap.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}
