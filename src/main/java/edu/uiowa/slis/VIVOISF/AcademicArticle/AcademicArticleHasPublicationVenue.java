package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleHasPublicationVenueIterator theAcademicArticleHasPublicationVenueIterator = (AcademicArticleHasPublicationVenueIterator)findAncestorWithClass(this, AcademicArticleHasPublicationVenueIterator.class);
			pageContext.getOut().print(theAcademicArticleHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

