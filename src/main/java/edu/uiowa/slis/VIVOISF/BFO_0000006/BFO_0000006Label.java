package edu.uiowa.slis.VIVOISF.BFO_0000006;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000006Label extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000006Label currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000006Label.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000006 theBFO_0000006 = (BFO_0000006)findAncestorWithClass(this, BFO_0000006.class);
			if (!theBFO_0000006.commitNeeded) {
				pageContext.getOut().print(theBFO_0000006.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000006 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000006 for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			BFO_0000006 theBFO_0000006 = (BFO_0000006)findAncestorWithClass(this, BFO_0000006.class);
			return theBFO_0000006.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing BFO_0000006 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000006 for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			BFO_0000006 theBFO_0000006 = (BFO_0000006)findAncestorWithClass(this, BFO_0000006.class);
			theBFO_0000006.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000006 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000006 for label tag ");
		}
	}
}

