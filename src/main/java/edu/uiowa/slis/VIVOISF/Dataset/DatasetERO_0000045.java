package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetERO_0000045Iterator theDataset = (DatasetERO_0000045Iterator)findAncestorWithClass(this, DatasetERO_0000045Iterator.class);
			pageContext.getOut().print(theDataset.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

