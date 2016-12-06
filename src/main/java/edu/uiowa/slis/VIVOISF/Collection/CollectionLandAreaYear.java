package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionLandAreaYearIterator theCollection = (CollectionLandAreaYearIterator)findAncestorWithClass(this, CollectionLandAreaYearIterator.class);
			pageContext.getOut().print(theCollection.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}
