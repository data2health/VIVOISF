package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameOfficialFRIterator theTerritory = (TerritoryNameOfficialFRIterator)findAncestorWithClass(this, TerritoryNameOfficialFRIterator.class);
			pageContext.getOut().print(theTerritory.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

