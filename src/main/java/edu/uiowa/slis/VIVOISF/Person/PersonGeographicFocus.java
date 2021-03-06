package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonGeographicFocusIterator thePersonGeographicFocusIterator = (PersonGeographicFocusIterator)findAncestorWithClass(this, PersonGeographicFocusIterator.class);
			pageContext.getOut().print(thePersonGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

