package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNationalityRUIterator thePeriodical = (PeriodicalNationalityRUIterator)findAncestorWithClass(this, PeriodicalNationalityRUIterator.class);
			pageContext.getOut().print(thePeriodical.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}
