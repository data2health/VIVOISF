package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetCodeDBPediaIDIterator theDataset = (DatasetCodeDBPediaIDIterator)findAncestorWithClass(this, DatasetCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theDataset.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

