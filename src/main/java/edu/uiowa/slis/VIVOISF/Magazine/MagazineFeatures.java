package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineFeaturesIterator theMagazineFeaturesIterator = (MagazineFeaturesIterator)findAncestorWithClass(this, MagazineFeaturesIterator.class);
			pageContext.getOut().print(theMagazineFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for features tag ");
		}
		return SKIP_BODY;
	}
}
