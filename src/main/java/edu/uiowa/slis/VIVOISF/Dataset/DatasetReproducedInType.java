package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetReproducedInIterator theDatasetReproducedInIterator = (DatasetReproducedInIterator)findAncestorWithClass(this, DatasetReproducedInIterator.class);
			pageContext.getOut().print(theDatasetReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}
