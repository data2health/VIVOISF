package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingRO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingRO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingRO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingRO_0002234Iterator thenon_self_governingRO_0002234Iterator = (non_self_governingRO_0002234Iterator)findAncestorWithClass(this, non_self_governingRO_0002234Iterator.class);
			pageContext.getOut().print(thenon_self_governingRO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}
