package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleDateTimeValueIterator theAcademicArticleDateTimeValueIterator = (AcademicArticleDateTimeValueIterator)findAncestorWithClass(this, AcademicArticleDateTimeValueIterator.class);
			pageContext.getOut().print(theAcademicArticleDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

