package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetPageEndIterator theDataset = (DatasetPageEndIterator)findAncestorWithClass(this, DatasetPageEndIterator.class);
			pageContext.getOut().print(theDataset.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}
