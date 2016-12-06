package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionNameCurrencyENIterator theNonAcademicPosition = (NonAcademicPositionNameCurrencyENIterator)findAncestorWithClass(this, NonAcademicPositionNameCurrencyENIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

