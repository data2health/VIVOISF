package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameOfficialITIterator theDataset = (DatasetNameOfficialITIterator)findAncestorWithClass(this, DatasetNameOfficialITIterator.class);
			pageContext.getOut().print(theDataset.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

