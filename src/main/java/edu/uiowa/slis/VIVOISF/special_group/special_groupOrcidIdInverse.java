package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupOrcidIdInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupOrcidIdInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupOrcidIdInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupOrcidIdInverseIterator thespecial_groupOrcidIdInverseIterator = (special_groupOrcidIdInverseIterator)findAncestorWithClass(this, special_groupOrcidIdInverseIterator.class);
			pageContext.getOut().print(thespecial_groupOrcidIdInverseIterator.getOrcidIdInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

