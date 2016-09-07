package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportCitedByIterator theReportCitedByIterator = (ReportCitedByIterator)findAncestorWithClass(this, ReportCitedByIterator.class);
			pageContext.getOut().print(theReportCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for citedBy tag ");
		}
		return SKIP_BODY;
	}
}
