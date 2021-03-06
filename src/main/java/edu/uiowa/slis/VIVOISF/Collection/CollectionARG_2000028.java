package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionARG_2000028Iterator theCollectionARG_2000028Iterator = (CollectionARG_2000028Iterator)findAncestorWithClass(this, CollectionARG_2000028Iterator.class);
			pageContext.getOut().print(theCollectionARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

