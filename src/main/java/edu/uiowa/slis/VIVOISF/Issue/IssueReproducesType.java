package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueReproducesIterator theIssueReproducesIterator = (IssueReproducesIterator)findAncestorWithClass(this, IssueReproducesIterator.class);
			pageContext.getOut().print(theIssueReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for reproduces tag ");
		}
		return SKIP_BODY;
	}
}
