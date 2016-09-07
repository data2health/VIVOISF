package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasTranslationIterator theDatasetHasTranslationIterator = (DatasetHasTranslationIterator)findAncestorWithClass(this, DatasetHasTranslationIterator.class);
			pageContext.getOut().print(theDatasetHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}
