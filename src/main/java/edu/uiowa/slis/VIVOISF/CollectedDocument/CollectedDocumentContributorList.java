package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentContributorListIterator theCollectedDocumentContributorListIterator = (CollectedDocumentContributorListIterator)findAncestorWithClass(this, CollectedDocumentContributorListIterator.class);
			pageContext.getOut().print(theCollectedDocumentContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for contributorList tag ");
		}
		return SKIP_BODY;
	}
}
