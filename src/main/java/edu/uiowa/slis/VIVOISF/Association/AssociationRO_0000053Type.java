package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationRO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationRO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationRO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationRO_0000053Iterator theAssociationRO_0000053Iterator = (AssociationRO_0000053Iterator)findAncestorWithClass(this, AssociationRO_0000053Iterator.class);
			pageContext.getOut().print(theAssociationRO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}
