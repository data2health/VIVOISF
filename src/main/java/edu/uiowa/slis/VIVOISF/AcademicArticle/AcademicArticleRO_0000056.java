package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleRO_0000056Iterator theAcademicArticleRO_0000056Iterator = (AcademicArticleRO_0000056Iterator)findAncestorWithClass(this, AcademicArticleRO_0000056Iterator.class);
			pageContext.getOut().print(theAcademicArticleRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}
