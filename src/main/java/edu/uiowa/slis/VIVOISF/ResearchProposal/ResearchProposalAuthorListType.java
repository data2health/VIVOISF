package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalAuthorListIterator theResearchProposalAuthorListIterator = (ResearchProposalAuthorListIterator)findAncestorWithClass(this, ResearchProposalAuthorListIterator.class);
			pageContext.getOut().print(theResearchProposalAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for authorList tag ");
		}
		return SKIP_BODY;
	}
}
