package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565Overview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565Overview currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565Overview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565 theERO_0000565 = (ERO_0000565)findAncestorWithClass(this, ERO_0000565.class);
			if (!theERO_0000565.commitNeeded) {
				pageContext.getOut().print(theERO_0000565.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			ERO_0000565 theERO_0000565 = (ERO_0000565)findAncestorWithClass(this, ERO_0000565.class);
			return theERO_0000565.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing ERO_0000565 for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			ERO_0000565 theERO_0000565 = (ERO_0000565)findAncestorWithClass(this, ERO_0000565.class);
			theERO_0000565.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for overview tag ");
		}
	}
}
