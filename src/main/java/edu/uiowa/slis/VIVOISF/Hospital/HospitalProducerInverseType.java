package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalProducerInverseIterator theHospitalProducerInverseIterator = (HospitalProducerInverseIterator)findAncestorWithClass(this, HospitalProducerInverseIterator.class);
			pageContext.getOut().print(theHospitalProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for producer tag ");
		}
		return SKIP_BODY;
	}
}
