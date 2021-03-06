package edu.uiowa.slis.VIVOISF.BFO_0000023;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000023HideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000023HideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000023HideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000023 theBFO_0000023 = (BFO_0000023)findAncestorWithClass(this, BFO_0000023.class);
			if (!theBFO_0000023.commitNeeded) {
				pageContext.getOut().print(theBFO_0000023.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000023 for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000023 for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			BFO_0000023 theBFO_0000023 = (BFO_0000023)findAncestorWithClass(this, BFO_0000023.class);
			return theBFO_0000023.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing BFO_0000023 for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000023 for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			BFO_0000023 theBFO_0000023 = (BFO_0000023)findAncestorWithClass(this, BFO_0000023.class);
			theBFO_0000023.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000023 for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000023 for hideFromDisplay tag ");
		}
	}
}

