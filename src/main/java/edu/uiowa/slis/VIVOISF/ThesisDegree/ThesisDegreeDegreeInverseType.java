package edu.uiowa.slis.VIVOISF.ThesisDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisDegreeDegreeInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisDegreeDegreeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisDegreeDegreeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisDegreeDegreeInverseIterator theThesisDegreeDegreeInverseIterator = (ThesisDegreeDegreeInverseIterator)findAncestorWithClass(this, ThesisDegreeDegreeInverseIterator.class);
			pageContext.getOut().print(theThesisDegreeDegreeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThesisDegree for degree tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for degree tag ");
		}
		return SKIP_BODY;
	}
}

