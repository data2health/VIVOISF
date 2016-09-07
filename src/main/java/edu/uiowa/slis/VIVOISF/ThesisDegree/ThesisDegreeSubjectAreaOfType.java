package edu.uiowa.slis.VIVOISF.ThesisDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisDegreeSubjectAreaOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisDegreeSubjectAreaOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisDegreeSubjectAreaOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisDegreeSubjectAreaOfIterator theThesisDegreeSubjectAreaOfIterator = (ThesisDegreeSubjectAreaOfIterator)findAncestorWithClass(this, ThesisDegreeSubjectAreaOfIterator.class);
			pageContext.getOut().print(theThesisDegreeSubjectAreaOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThesisDegree for subjectAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for subjectAreaOf tag ");
		}
		return SKIP_BODY;
	}
}
