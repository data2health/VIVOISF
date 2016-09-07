package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReportInformationResourceSupportedByIterator theReportInformationResourceSupportedByIterator = (ReportInformationResourceSupportedByIterator)findAncestorWithClass(this, ReportInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theReportInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}
