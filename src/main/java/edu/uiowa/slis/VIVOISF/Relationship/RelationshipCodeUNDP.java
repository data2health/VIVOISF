package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipCodeUNDPIterator theRelationship = (RelationshipCodeUNDPIterator)findAncestorWithClass(this, RelationshipCodeUNDPIterator.class);
			pageContext.getOut().print(theRelationship.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

