package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Authorship theAuthorship = (Authorship)findAncestorWithClass(this, Authorship.class);
			if (!theAuthorship.commitNeeded) {
				pageContext.getOut().print(theAuthorship.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Authorship theAuthorship = (Authorship)findAncestorWithClass(this, Authorship.class);
			return theAuthorship.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Authorship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Authorship theAuthorship = (Authorship)findAncestorWithClass(this, Authorship.class);
			theAuthorship.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for label tag ");
		}
	}
}

