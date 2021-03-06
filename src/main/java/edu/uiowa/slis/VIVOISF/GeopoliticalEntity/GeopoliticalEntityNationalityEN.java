package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNationalityENIterator theGeopoliticalEntity = (GeopoliticalEntityNationalityENIterator)findAncestorWithClass(this, GeopoliticalEntityNationalityENIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

