package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleARG_2000028Iterator theAcademicArticleARG_2000028Iterator = (AcademicArticleARG_2000028Iterator)findAncestorWithClass(this, AcademicArticleARG_2000028Iterator.class);
			pageContext.getOut().print(theAcademicArticleARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

