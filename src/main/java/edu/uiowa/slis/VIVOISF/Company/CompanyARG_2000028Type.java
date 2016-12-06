package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyARG_2000028Iterator theCompanyARG_2000028Iterator = (CompanyARG_2000028Iterator)findAncestorWithClass(this, CompanyARG_2000028Iterator.class);
			pageContext.getOut().print(theCompanyARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}
