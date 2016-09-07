package edu.uiowa.slis.VIVOISF.Certificate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CertificateBroader extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CertificateBroader currentInstance = null;
	private static final Log log = LogFactory.getLog(CertificateBroader.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CertificateBroaderIterator theCertificateBroaderIterator = (CertificateBroaderIterator)findAncestorWithClass(this, CertificateBroaderIterator.class);
			pageContext.getOut().print(theCertificateBroaderIterator.getBroader());
		} catch (Exception e) {
			log.error("Can't find enclosing Certificate for broader tag ", e);
			throw new JspTagException("Error: Can't find enclosing Certificate for broader tag ");
		}
		return SKIP_BODY;
	}
}
