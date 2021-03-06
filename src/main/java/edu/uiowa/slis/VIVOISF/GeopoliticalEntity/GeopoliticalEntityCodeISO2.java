package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityCodeISO2Iterator theGeopoliticalEntity = (GeopoliticalEntityCodeISO2Iterator)findAncestorWithClass(this, GeopoliticalEntityCodeISO2Iterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

