package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipHasNameIterator theRelationshipHasNameIterator = (RelationshipHasNameIterator)findAncestorWithClass(this, RelationshipHasNameIterator.class);
			pageContext.getOut().print(theRelationshipHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for hasName tag ");
		}
		return SKIP_BODY;
	}
}

