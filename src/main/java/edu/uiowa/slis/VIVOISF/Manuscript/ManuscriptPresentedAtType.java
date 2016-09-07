package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptPresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptPresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptPresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptPresentedAtIterator theManuscriptPresentedAtIterator = (ManuscriptPresentedAtIterator)findAncestorWithClass(this, ManuscriptPresentedAtIterator.class);
			pageContext.getOut().print(theManuscriptPresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}
