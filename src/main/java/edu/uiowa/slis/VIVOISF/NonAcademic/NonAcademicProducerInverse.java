package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicProducerInverseIterator theNonAcademicProducerInverseIterator = (NonAcademicProducerInverseIterator)findAncestorWithClass(this, NonAcademicProducerInverseIterator.class);
			pageContext.getOut().print(theNonAcademicProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for producer tag ");
		}
		return SKIP_BODY;
	}
}
