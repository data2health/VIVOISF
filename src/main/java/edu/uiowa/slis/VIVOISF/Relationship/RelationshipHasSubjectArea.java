package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipHasSubjectAreaIterator theRelationshipHasSubjectAreaIterator = (RelationshipHasSubjectAreaIterator)findAncestorWithClass(this, RelationshipHasSubjectAreaIterator.class);
			pageContext.getOut().print(theRelationshipHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

