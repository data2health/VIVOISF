package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalEanucc13Iterator theResearchProposal = (ResearchProposalEanucc13Iterator)findAncestorWithClass(this, ResearchProposalEanucc13Iterator.class);
			pageContext.getOut().print(theResearchProposal.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}
