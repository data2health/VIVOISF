package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RelationshipCodeFAOTERMIterator theRelationship = (RelationshipCodeFAOTERMIterator)findAncestorWithClass(this, RelationshipCodeFAOTERMIterator.class);
			pageContext.getOut().print(theRelationship.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

