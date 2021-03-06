package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TerritoryBFO_0000051Iterator theTerritoryBFO_0000051Iterator = (TerritoryBFO_0000051Iterator)findAncestorWithClass(this, TerritoryBFO_0000051Iterator.class);
			pageContext.getOut().print(theTerritoryBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

