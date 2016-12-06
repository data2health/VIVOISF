package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipNameShortENIterator theRelationship = (RelationshipNameShortENIterator)findAncestorWithClass(this, RelationshipNameShortENIterator.class);
			pageContext.getOut().print(theRelationship.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

