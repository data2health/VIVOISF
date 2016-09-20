package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityValidInInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityValidInInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityValidInInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityValidInInverseIterator theGeopoliticalEntityValidInInverseIterator = (GeopoliticalEntityValidInInverseIterator)findAncestorWithClass(this, GeopoliticalEntityValidInInverseIterator.class);
			pageContext.getOut().print(theGeopoliticalEntityValidInInverseIterator.getValidInInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for validIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for validIn tag ");
		}
		return SKIP_BODY;
	}
}

