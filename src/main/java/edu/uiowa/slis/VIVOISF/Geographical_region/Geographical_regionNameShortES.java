package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionNameShortESIterator theGeographical_region = (Geographical_regionNameShortESIterator)findAncestorWithClass(this, Geographical_regionNameShortESIterator.class);
			pageContext.getOut().print(theGeographical_region.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

