package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetReviewOfIterator theDatasetReviewOfIterator = (DatasetReviewOfIterator)findAncestorWithClass(this, DatasetReviewOfIterator.class);
			pageContext.getOut().print(theDatasetReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}
