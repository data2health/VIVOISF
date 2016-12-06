package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetLandAreaUnitIterator theDataset = (DatasetLandAreaUnitIterator)findAncestorWithClass(this, DatasetLandAreaUnitIterator.class);
			pageContext.getOut().print(theDataset.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}
