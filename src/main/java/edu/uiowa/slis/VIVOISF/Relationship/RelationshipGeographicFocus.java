package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipGeographicFocusIterator theRelationshipGeographicFocusIterator = (RelationshipGeographicFocusIterator)findAncestorWithClass(this, RelationshipGeographicFocusIterator.class);
			pageContext.getOut().print(theRelationshipGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}
