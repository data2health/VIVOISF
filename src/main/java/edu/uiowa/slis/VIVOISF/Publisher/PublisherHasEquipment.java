package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherHasEquipment extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherHasEquipment currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherHasEquipment.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherHasEquipmentIterator thePublisherHasEquipmentIterator = (PublisherHasEquipmentIterator)findAncestorWithClass(this, PublisherHasEquipmentIterator.class);
			pageContext.getOut().print(thePublisherHasEquipmentIterator.getHasEquipment());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}
