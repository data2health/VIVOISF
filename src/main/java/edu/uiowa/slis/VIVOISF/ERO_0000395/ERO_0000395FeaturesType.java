package edu.uiowa.slis.VIVOISF.ERO_0000395;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000395FeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000395FeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000395FeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000395FeaturesIterator theERO_0000395FeaturesIterator = (ERO_0000395FeaturesIterator)findAncestorWithClass(this, ERO_0000395FeaturesIterator.class);
			pageContext.getOut().print(theERO_0000395FeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000395 for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000395 for features tag ");
		}
		return SKIP_BODY;
	}
}
