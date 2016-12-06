package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualHDINotesIterator theIndividual = (IndividualHDINotesIterator)findAncestorWithClass(this, IndividualHDINotesIterator.class);
			pageContext.getOut().print(theIndividual.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

