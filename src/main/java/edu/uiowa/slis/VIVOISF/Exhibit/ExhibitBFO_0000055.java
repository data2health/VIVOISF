package edu.uiowa.slis.VIVOISF.Exhibit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExhibitBFO_0000055 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExhibitBFO_0000055 currentInstance = null;
	private static final Log log = LogFactory.getLog(ExhibitBFO_0000055.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExhibitBFO_0000055Iterator theExhibitBFO_0000055Iterator = (ExhibitBFO_0000055Iterator)findAncestorWithClass(this, ExhibitBFO_0000055Iterator.class);
			pageContext.getOut().print(theExhibitBFO_0000055Iterator.getBFO_0000055());
		} catch (Exception e) {
			log.error("Can't find enclosing Exhibit for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Exhibit for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}
