package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalAgriculturalAreaTotalIterator thePeriodical = (PeriodicalAgriculturalAreaTotalIterator)findAncestorWithClass(this, PeriodicalAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(thePeriodical.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}
