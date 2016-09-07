package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratorySponsorsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratorySponsorsType currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratorySponsorsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratorySponsorsIterator theCoreLaboratorySponsorsIterator = (CoreLaboratorySponsorsIterator)findAncestorWithClass(this, CoreLaboratorySponsorsIterator.class);
			pageContext.getOut().print(theCoreLaboratorySponsorsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for sponsors tag ");
		}
		return SKIP_BODY;
	}
}
