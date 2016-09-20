package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentIssuerInverseIterator theGraduateStudentIssuerInverseIterator = (GraduateStudentIssuerInverseIterator)findAncestorWithClass(this, GraduateStudentIssuerInverseIterator.class);
			pageContext.getOut().print(theGraduateStudentIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for issuer tag ");
		}
		return SKIP_BODY;
	}
}

