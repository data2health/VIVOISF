package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumERO_0000037Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumERO_0000037Type currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumERO_0000037Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumERO_0000037Iterator theMuseumERO_0000037Iterator = (MuseumERO_0000037Iterator)findAncestorWithClass(this, MuseumERO_0000037Iterator.class);
			pageContext.getOut().print(theMuseumERO_0000037Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}
