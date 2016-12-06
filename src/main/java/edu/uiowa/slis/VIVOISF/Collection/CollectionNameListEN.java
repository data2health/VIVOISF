package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameListENIterator theCollection = (CollectionNameListENIterator)findAncestorWithClass(this, CollectionNameListENIterator.class);
			pageContext.getOut().print(theCollection.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

