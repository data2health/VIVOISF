package edu.uiowa.slis.VIVOISF.Report;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReportAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReportAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ReportAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReportAgriculturalAreaYearIterator theReport = (ReportAgriculturalAreaYearIterator)findAncestorWithClass(this, ReportAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theReport.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Report for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Report for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}
