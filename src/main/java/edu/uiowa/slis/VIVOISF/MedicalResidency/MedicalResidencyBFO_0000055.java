package edu.uiowa.slis.VIVOISF.MedicalResidency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MedicalResidencyBFO_0000055 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MedicalResidencyBFO_0000055 currentInstance = null;
	private static final Log log = LogFactory.getLog(MedicalResidencyBFO_0000055.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MedicalResidencyBFO_0000055Iterator theMedicalResidencyBFO_0000055Iterator = (MedicalResidencyBFO_0000055Iterator)findAncestorWithClass(this, MedicalResidencyBFO_0000055Iterator.class);
			pageContext.getOut().print(theMedicalResidencyBFO_0000055Iterator.getBFO_0000055());
		} catch (Exception e) {
			log.error("Can't find enclosing MedicalResidency for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing MedicalResidency for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}
