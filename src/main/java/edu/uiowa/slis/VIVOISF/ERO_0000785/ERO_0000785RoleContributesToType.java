package edu.uiowa.slis.VIVOISF.ERO_0000785;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000785RoleContributesToType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000785RoleContributesToType currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000785RoleContributesToType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000785RoleContributesToIterator theERO_0000785RoleContributesToIterator = (ERO_0000785RoleContributesToIterator)findAncestorWithClass(this, ERO_0000785RoleContributesToIterator.class);
			pageContext.getOut().print(theERO_0000785RoleContributesToIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000785 for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000785 for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}
