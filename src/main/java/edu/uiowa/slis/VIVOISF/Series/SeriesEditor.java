package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesEditorIterator theSeriesEditorIterator = (SeriesEditorIterator)findAncestorWithClass(this, SeriesEditorIterator.class);
			pageContext.getOut().print(theSeriesEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for editor tag ");
		}
		return SKIP_BODY;
	}
}
