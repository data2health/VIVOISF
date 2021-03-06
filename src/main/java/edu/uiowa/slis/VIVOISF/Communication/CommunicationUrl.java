package edu.uiowa.slis.VIVOISF.Communication;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommunicationUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommunicationUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(CommunicationUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommunicationUrlIterator theCommunication = (CommunicationUrlIterator)findAncestorWithClass(this, CommunicationUrlIterator.class);
			pageContext.getOut().print(theCommunication.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Communication for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Communication for url tag ");
		}
		return SKIP_BODY;
	}
}

