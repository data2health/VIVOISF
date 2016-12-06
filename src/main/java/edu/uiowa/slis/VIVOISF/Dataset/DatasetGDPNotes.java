package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetGDPNotesIterator theDataset = (DatasetGDPNotesIterator)findAncestorWithClass(this, DatasetGDPNotesIterator.class);
			pageContext.getOut().print(theDataset.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

