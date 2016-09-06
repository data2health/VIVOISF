package edu.uiowa.slis.VIVOISF.Facility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacilitySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacilitySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(FacilitySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Facility theFacility = (Facility)findAncestorWithClass(this, Facility.class);
			if (!theFacility.commitNeeded) {
				pageContext.getOut().print(theFacility.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Facility for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Facility for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Facility theFacility = (Facility)findAncestorWithClass(this, Facility.class);
			return theFacility.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Facility for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Facility for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Facility theFacility = (Facility)findAncestorWithClass(this, Facility.class);
			theFacility.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Facility for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Facility for subjectURI tag ");
		}
	}
}

