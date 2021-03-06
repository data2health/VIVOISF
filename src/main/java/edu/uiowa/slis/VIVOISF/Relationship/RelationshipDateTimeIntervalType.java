package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipDateTimeIntervalIterator theRelationshipDateTimeIntervalIterator = (RelationshipDateTimeIntervalIterator)findAncestorWithClass(this, RelationshipDateTimeIntervalIterator.class);
			pageContext.getOut().print(theRelationshipDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

