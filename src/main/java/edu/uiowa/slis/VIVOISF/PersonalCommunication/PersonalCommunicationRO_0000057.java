package edu.uiowa.slis.VIVOISF.PersonalCommunication;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalCommunicationRO_0000057 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonalCommunicationRO_0000057 currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalCommunicationRO_0000057.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalCommunicationRO_0000057Iterator thePersonalCommunicationRO_0000057Iterator = (PersonalCommunicationRO_0000057Iterator)findAncestorWithClass(this, PersonalCommunicationRO_0000057Iterator.class);
			pageContext.getOut().print(thePersonalCommunicationRO_0000057Iterator.getRO_0000057());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalCommunication for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalCommunication for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}
