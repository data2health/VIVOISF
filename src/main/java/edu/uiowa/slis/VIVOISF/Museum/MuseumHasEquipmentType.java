package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumHasEquipmentType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumHasEquipmentType currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumHasEquipmentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumHasEquipmentIterator theMuseumHasEquipmentIterator = (MuseumHasEquipmentIterator)findAncestorWithClass(this, MuseumHasEquipmentIterator.class);
			pageContext.getOut().print(theMuseumHasEquipmentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for hasEquipment tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for hasEquipment tag ");
		}
		return SKIP_BODY;
	}
}
