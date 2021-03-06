package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionNameListENIterator theGeographical_region = (Geographical_regionNameListENIterator)findAncestorWithClass(this, Geographical_regionNameListENIterator.class);
			pageContext.getOut().print(theGeographical_region.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

