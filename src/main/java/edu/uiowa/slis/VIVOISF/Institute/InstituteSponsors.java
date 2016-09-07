package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteSponsors extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteSponsors currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteSponsors.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteSponsorsIterator theInstituteSponsorsIterator = (InstituteSponsorsIterator)findAncestorWithClass(this, InstituteSponsorsIterator.class);
			pageContext.getOut().print(theInstituteSponsorsIterator.getSponsors());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for sponsors tag ");
		}
		return SKIP_BODY;
	}
}
