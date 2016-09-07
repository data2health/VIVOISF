package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentOutreachOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentOutreachOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentOutreachOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GraduateStudent theGraduateStudent = (GraduateStudent)findAncestorWithClass(this, GraduateStudent.class);
			if (!theGraduateStudent.commitNeeded) {
				pageContext.getOut().print(theGraduateStudent.getOutreachOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for outreachOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getOutreachOverview() throws JspTagException {
		try {
			GraduateStudent theGraduateStudent = (GraduateStudent)findAncestorWithClass(this, GraduateStudent.class);
			return theGraduateStudent.getOutreachOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing GraduateStudent for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for outreachOverview tag ");
		}
	}

	public void setOutreachOverview(String outreachOverview) throws JspTagException {
		try {
			GraduateStudent theGraduateStudent = (GraduateStudent)findAncestorWithClass(this, GraduateStudent.class);
			theGraduateStudent.setOutreachOverview(outreachOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for outreachOverview tag ");
		}
	}
}
