package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionRO_0001015Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionRO_0001015Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionRO_0001015Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionRO_0001015Iterator theCollectionRO_0001015Iterator = (CollectionRO_0001015Iterator)findAncestorWithClass(this, CollectionRO_0001015Iterator.class);
			pageContext.getOut().print(theCollectionRO_0001015Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}
