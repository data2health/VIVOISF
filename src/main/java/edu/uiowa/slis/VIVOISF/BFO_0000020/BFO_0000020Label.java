package edu.uiowa.slis.VIVOISF.BFO_0000020;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000020Label extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000020Label currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000020Label.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000020 theBFO_0000020 = (BFO_0000020)findAncestorWithClass(this, BFO_0000020.class);
			if (!theBFO_0000020.commitNeeded) {
				pageContext.getOut().print(theBFO_0000020.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000020 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000020 for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			BFO_0000020 theBFO_0000020 = (BFO_0000020)findAncestorWithClass(this, BFO_0000020.class);
			return theBFO_0000020.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing BFO_0000020 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000020 for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			BFO_0000020 theBFO_0000020 = (BFO_0000020)findAncestorWithClass(this, BFO_0000020.class);
			theBFO_0000020.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000020 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000020 for label tag ");
		}
	}
}

