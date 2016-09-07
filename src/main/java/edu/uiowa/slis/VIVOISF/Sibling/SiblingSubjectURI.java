package edu.uiowa.slis.VIVOISF.Sibling;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SiblingSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SiblingSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(SiblingSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Sibling theSibling = (Sibling)findAncestorWithClass(this, Sibling.class);
			if (!theSibling.commitNeeded) {
				pageContext.getOut().print(theSibling.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Sibling for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sibling for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Sibling theSibling = (Sibling)findAncestorWithClass(this, Sibling.class);
			return theSibling.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Sibling for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sibling for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Sibling theSibling = (Sibling)findAncestorWithClass(this, Sibling.class);
			theSibling.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Sibling for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sibling for subjectURI tag ");
		}
	}
}
