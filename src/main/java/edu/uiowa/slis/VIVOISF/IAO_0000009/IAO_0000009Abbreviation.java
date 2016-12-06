package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009Abbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009Abbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009Abbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009 theIAO_0000009 = (IAO_0000009)findAncestorWithClass(this, IAO_0000009.class);
			if (!theIAO_0000009.commitNeeded) {
				pageContext.getOut().print(theIAO_0000009.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			IAO_0000009 theIAO_0000009 = (IAO_0000009)findAncestorWithClass(this, IAO_0000009.class);
			return theIAO_0000009.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing IAO_0000009 for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			IAO_0000009 theIAO_0000009 = (IAO_0000009)findAncestorWithClass(this, IAO_0000009.class);
			theIAO_0000009.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for abbreviation tag ");
		}
	}
}

