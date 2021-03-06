package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityLandAreaUnitIterator theGeopoliticalEntity = (GeopoliticalEntityLandAreaUnitIterator)findAncestorWithClass(this, GeopoliticalEntityLandAreaUnitIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

