package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleProducerIterator theEditorialArticleProducerIterator = (EditorialArticleProducerIterator)findAncestorWithClass(this, EditorialArticleProducerIterator.class);
			pageContext.getOut().print(theEditorialArticleProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for producer tag ");
		}
		return SKIP_BODY;
	}
}
