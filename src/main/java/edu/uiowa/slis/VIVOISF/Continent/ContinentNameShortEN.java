package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameShortENIterator theContinent = (ContinentNameShortENIterator)findAncestorWithClass(this, ContinentNameShortENIterator.class);
			pageContext.getOut().print(theContinent.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

