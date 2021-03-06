package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030SubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030SubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030SubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030 theIAO_0000030 = (IAO_0000030)findAncestorWithClass(this, IAO_0000030.class);
			if (!theIAO_0000030.commitNeeded) {
				pageContext.getOut().print(theIAO_0000030.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			IAO_0000030 theIAO_0000030 = (IAO_0000030)findAncestorWithClass(this, IAO_0000030.class);
			return theIAO_0000030.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing IAO_0000030 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			IAO_0000030 theIAO_0000030 = (IAO_0000030)findAncestorWithClass(this, IAO_0000030.class);
			theIAO_0000030.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for subjectURI tag ");
		}
	}
}

