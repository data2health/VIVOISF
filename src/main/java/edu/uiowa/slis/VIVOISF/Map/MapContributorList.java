package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(MapContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapContributorListIterator theMapContributorListIterator = (MapContributorListIterator)findAncestorWithClass(this, MapContributorListIterator.class);
			pageContext.getOut().print(theMapContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for contributorList tag ");
		}
		return SKIP_BODY;
	}
}
