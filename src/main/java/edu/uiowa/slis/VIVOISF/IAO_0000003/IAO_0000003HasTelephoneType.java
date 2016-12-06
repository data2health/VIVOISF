package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003HasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003HasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003HasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003HasTelephoneIterator theIAO_0000003HasTelephoneIterator = (IAO_0000003HasTelephoneIterator)findAncestorWithClass(this, IAO_0000003HasTelephoneIterator.class);
			pageContext.getOut().print(theIAO_0000003HasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}
