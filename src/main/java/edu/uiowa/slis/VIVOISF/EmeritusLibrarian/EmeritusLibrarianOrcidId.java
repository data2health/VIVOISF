package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianOrcidId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianOrcidId currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianOrcidId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianOrcidIdIterator theEmeritusLibrarian = (EmeritusLibrarianOrcidIdIterator)findAncestorWithClass(this, EmeritusLibrarianOrcidIdIterator.class);
			pageContext.getOut().print(theEmeritusLibrarian.getOrcidId());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

