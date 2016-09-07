package edu.uiowa.slis.VIVOISF.License;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LicenseSubjectAreaOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LicenseSubjectAreaOf currentInstance = null;
	private static final Log log = LogFactory.getLog(LicenseSubjectAreaOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LicenseSubjectAreaOfIterator theLicenseSubjectAreaOfIterator = (LicenseSubjectAreaOfIterator)findAncestorWithClass(this, LicenseSubjectAreaOfIterator.class);
			pageContext.getOut().print(theLicenseSubjectAreaOfIterator.getSubjectAreaOf());
		} catch (Exception e) {
			log.error("Can't find enclosing License for subjectAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing License for subjectAreaOf tag ");
		}
		return SKIP_BODY;
	}
}
