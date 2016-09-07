package edu.uiowa.slis.VIVOISF.Definition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DefinitionIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DefinitionIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(DefinitionIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DefinitionIAO_0000136Iterator theDefinitionIAO_0000136Iterator = (DefinitionIAO_0000136Iterator)findAncestorWithClass(this, DefinitionIAO_0000136Iterator.class);
			pageContext.getOut().print(theDefinitionIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Definition for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Definition for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}
