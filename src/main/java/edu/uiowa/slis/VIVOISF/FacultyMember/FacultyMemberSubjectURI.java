package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FacultyMember theFacultyMember = (FacultyMember)findAncestorWithClass(this, FacultyMember.class);
			if (!theFacultyMember.commitNeeded) {
				pageContext.getOut().print(theFacultyMember.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			FacultyMember theFacultyMember = (FacultyMember)findAncestorWithClass(this, FacultyMember.class);
			return theFacultyMember.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing FacultyMember for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			FacultyMember theFacultyMember = (FacultyMember)findAncestorWithClass(this, FacultyMember.class);
			theFacultyMember.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for subjectURI tag ");
		}
	}
}
