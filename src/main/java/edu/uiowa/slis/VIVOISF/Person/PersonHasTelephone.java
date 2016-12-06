package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonHasTelephoneIterator thePersonHasTelephoneIterator = (PersonHasTelephoneIterator)findAncestorWithClass(this, PersonHasTelephoneIterator.class);
			pageContext.getOut().print(thePersonHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}
